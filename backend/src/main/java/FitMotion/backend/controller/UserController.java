package FitMotion.backend.controller;

import FitMotion.backend.dto.request.RequestLoginDTO;
import FitMotion.backend.dto.request.RequestSignUpDTO;
import FitMotion.backend.dto.response.ResponseLoginDTO;
import FitMotion.backend.dto.response.ResponseLogoutDTO;
import FitMotion.backend.dto.response.ResponseMessageDTO;
import FitMotion.backend.dto.update.UpdateUserProfileDTO;
import FitMotion.backend.exception.EmailAlreadyExistsException;
import FitMotion.backend.exception.InvalidPasswordException;
import FitMotion.backend.exception.UserNotFoundException;
import FitMotion.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 회원가입
     */
    @PostMapping("/signup")
    public ResponseEntity<ResponseMessageDTO> signUp(@RequestBody RequestSignUpDTO signUpDTO) {
        try {
            ResponseMessageDTO result = userService.signUp(signUpDTO);
            return new ResponseEntity<>(result, HttpStatus.valueOf(result.getStatusCode()));
        } catch (EmailAlreadyExistsException e) {
            return new ResponseEntity<>(new ResponseMessageDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseMessageDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "회원 가입 실패"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 로그인
     */
    @PostMapping("/login")
    public ResponseEntity<ResponseLoginDTO> login(@RequestBody RequestLoginDTO dto) {
        try {
            ResponseLoginDTO response = userService.login(dto);
            return ResponseEntity.ok(response);
        } catch (InvalidPasswordException e) {
            return new ResponseEntity<>(new ResponseLoginDTO(HttpStatus.UNAUTHORIZED.value(), "잘못된 비밀번호입니다.", null, null, dto.getEmail()), HttpStatus.UNAUTHORIZED);
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(new ResponseLoginDTO(HttpStatus.NOT_FOUND.value(), "존재하지 않는 계정입니다.", null, null, dto.getEmail()), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseLoginDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "로그인 실패", null, null, dto.getEmail()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * 로그아웃
     */
    @PostMapping("/logout")
    public ResponseEntity<ResponseLogoutDTO> logout() {
        ResponseLogoutDTO response = userService.logout();
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
    }
}
