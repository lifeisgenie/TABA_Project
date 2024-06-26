![alt text](image.png)

<br />

서비스명 : FitMotion  
팀명 : 운동보조
개발기간 : 2024.05.10 ~ 2024.06.18  
서비스 개요 : 운동 자세 보조 서비스  
[Notion](https://www.notion.so/genie/e1bfbd5bf7254f1bbe51fae49329a462)

---

<br />

# 목차

1. [서비스 소개](#1)
2. [기술 스택](#2)
3. [시스템 아키텍처](#3)
4. [주요 기능](#4)
5. [팀원 소개](#5)
6. [프로젝트 산출물](#6)

<br />

<div id='1'> </div>

# 서비스 소개

## **사용자에게 피드백을 제공하여 정확한 운동 자세를 제시**

> 

<br />

## **운동 자세가 걱정되시나요?**

> 모션 인식을 통해 어느 부분에서 자세가 문제가 있는지 표시해줘요

<br />

## **영상말고 다른 방법으로 피드백을 받고 싶나요?**

> 영상이 불편할 수도 있어서 텍스트로 자세하게 설명해줘요

<br />

## ***FitMotion에서 정확한 자세로 운동하고 있는지 확인해봐요*

<br />

<div id='2'></div>

# 기술 스택
<p align="center">
<img src="https://img.shields.io/badge/-JAVA-brightgreen" /> 
<img src="https://img.shields.io/badge/-Spring Boot-green" /> 
<img src="https://img.shields.io/badge/-SPRING SECURITY-yellowgreen" /> 
<img src="https://img.shields.io/badge/-JWT-yellow" /> 
<img src="https://img.shields.io/badge/-FLUTTER-blue" /> 
<img src="https://img.shields.io/badge/-JAVASCRIPT-yellow" /> 
<img src="https://img.shields.io/badge/-DART-green" /> 
<img src="https://img.shields.io/badge/-FIREBASE-blue" /> 
<img src="https://img.shields.io/badge/-PYTHON-orange" /> 
<img src="https://img.shields.io/badge/-COLAB-lightgrey" /> 
<img src="https://img.shields.io/badge/-TENSORFLOW-brightgreen" /> 
<img src="https://img.shields.io/badge/-MYSQL-brightgreen" /> 
<img src="https://img.shields.io/badge/-ANACONDA-yellow" /> 
<img src="https://img.shields.io/badge/-FLASK-red" /> 
<img src="https://img.shields.io/badge/-GITLAB-yellow" />  
</p>
<br />

## 상세 기술스택 및 버전

| 구분     | 기술스택     | 상세내용        | 버전    |
|----------|--------------|-----------------|---------|
| 공통     | 형상관리     | Gitlab          | \-      |
|          | 커뮤니케이션 | Discord         | \-      |
|          | 커뮤니케이션 | Notion          | \-      |
| Server   | 서버         | FireBase        | 13.11.2 |
|          | 플랫폼       | FLASK           | \-      |
| BackEnd  | DB           | MySQL           | 8.0.37  |
|          | Java         | JDK             | 17      |
|          | Spring       | Spring          | 3.2.5   |
|          |              | Spring Boot     | 3.2.5   |
|          |              | Spring Security | 6       |
|          | IDE          | Intellij        | 2024.2  |
|          | Build        | Gradle          | 8.7     |
|          | WebRTC       | JWT             | 0.11.0  |
| FrontEnd | Flutter      |                 | 3.22.0  |
| AI       | TensorFlow   |                 | 2.16.1  |
|          | Python       |                 | 3.11.9  |
|          | cuda         |                 | 11.8    |
|          | pytorch      |                 | 11.8    |

<br />

<div id="3"></div>

<br />

# 시스템 아키텍처

## 시스템 구성

![image](https://github.com/gangs8664/Github_User_Content/blob/b95dc3445fcb274c2cf722b53cd71553e8d84d96/system_architecture.png)

<br />

## 디렉토리 구조

![image](https://github.com/gangs8664/Github_User_Content/blob/b95dc3445fcb274c2cf722b53cd71553e8d84d96/directoryarchitecture.png)

<br />

<div id = "4"></div>

# 주요 기능

### AI피드백을 통해 정확한 자세 교정

- 이용자에게 시각적인 피드백을 제공한다.
- 정확한 운동 자세를 제시하여 자세 교정을 돕는다.

![i7b206 p ssafy io_randomvideo](https://github.com/gangs8664/Github_User_Content/blob/39ca2869dc22fe3ae012bf8704505e7f0a3e3253/demo1.png)
![i7b206 p ssafy io_randomvideo (1)](https://github.com/gangs8664/Github_User_Content/blob/39ca2869dc22fe3ae012bf8704505e7f0a3e3253/demo2.png)

## 이미지 갤러리

| 로그인 | 운동 촬영 | AI분석 대기 | AI분석 피드백 | 피드백 목록 이동| 틀린자세1 | 틀린자세2 |
|--------|--------|--------|--------|--------|--------|--------|
| <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_1%E1%84%87%E1%85%A5%E1%86%AB_%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%8B%E1%85%B5%E1%86%AB.gif" width="250px" /> | <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_2%E1%84%87%E1%85%A5%E1%86%AB_%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%83%E1%85%A9%E1%86%BC%E1%84%8E%E1%85%AA%E1%86%AF%E1%84%8B%E1%85%A7%E1%86%BC.gif" width="250px" /> | <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_3%E1%84%87%E1%85%A5%E1%86%AB_AI%E1%84%87%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%E1%86%A8%E1%84%83%E1%85%A2%E1%84%80%E1%85%B5.gif" width="250px" /> | <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_4%E1%84%87%E1%85%A5%E1%86%AB_AI%E1%84%87%E1%85%AE%E1%86%AB%E1%84%89%E1%85%A5%E1%86%A8%E1%84%91%E1%85%B5%E1%84%83%E1%85%B3%E1%84%87%E1%85%A2%E1%86%A8.gif" width="250px" /> | <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_5%E1%84%87%E1%85%A5%E1%86%AB_%E1%84%91%E1%85%B5%E1%84%83%E1%85%B3%E1%84%87%E1%85%A2%E1%86%A8%E1%84%86%E1%85%A9%E1%86%A8%E1%84%85%E1%85%A9%E1%86%A8%E1%84%8B%E1%85%B5%E1%84%83%E1%85%A9%E1%86%BC.gif" width="250px" /> | <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_6%E1%84%87%E1%85%A5%E1%86%AB_%E1%84%90%E1%85%B3%E1%86%AF%E1%84%85%E1%85%B5%E1%86%AB%E1%84%8C%E1%85%A1%E1%84%89%E1%85%A61.gif" width="250px" /> | <img src="https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/%E1%84%89%E1%85%B5%E1%84%8B%E1%85%A7%E1%86%AB_7%E1%84%87%E1%85%A5%E1%86%AB_%E1%84%90%E1%85%B3%E1%86%AF%E1%84%85%E1%85%B5%E1%86%AB%E1%84%8C%E1%85%A1%E1%84%89%E1%85%A62.gif" width="250px" /> |




<br />

<br />

<div id="5"></div>

# 팀원소개

## Team
|<img src="https://avatars.githubusercontent.com/u/89370421?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/145273667?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/160105597?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/168407176?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/115446843?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|:-:|
|조성환(팀장)<br/>[@Chos1](https://github.com/Chos1)|서강(FE)<br/>[@gangs8664](https://github.com/gangs8664)|한승진(BE)<br/>[@lifeisgenie](https://github.com/lifeisgenie)|황동혁(AI)<br/>[@ziphaiseod9](https://github.com/ziphaiseod9)|홍준기(AI)<br/>[@wnsrl4920](https://github.com/wnsrl4920)|

<br />

<div id="6"></div>

# 프로젝트 산출물

## 컨벤션

### **git commit**

![image](https://user-images.githubusercontent.com/53360337/184503246-50fdc64b-c21e-444b-80c0-c73ae9f9f9e8.png)

<br />

### **git flow**

![image](https://user-images.githubusercontent.com/53360337/184503290-072c65c7-7e4c-457a-9bc8-e395d37abc02.png)

<br />

### **code**

![image](https://user-images.githubusercontent.com/53360337/184523804-d2d5800a-d4bd-49df-ab00-ee0c1debea5f.png)

<br />

## 기능 명세서

![image](https://github.com/gangs8664/Github_User_Content/blob/44b1ef32c8a9ecd64ead21b2545da8fbca3cbd70/FitMotion_%E1%84%80%E1%85%B5%E1%84%82%E1%85%B3%E1%86%BC%E1%84%86%E1%85%A7%E1%86%BC%E1%84%89%E1%85%A6%E1%84%89%E1%85%A5.png)

<br />

## API 명세서

![image](https://github.com/gangs8664/Github_User_Content/blob/b95dc3445fcb274c2cf722b53cd71553e8d84d96/API.png)

<br />

## 화면 설계서

[화면 설계서](https://www.figma.com/design/rWutGyb1d2elwRDTxDQKt2/FitMotion's-Figma?node-id=0-1&t=PnSCEaaVufAEa4Af-1)

<br />

## ER-Diagram

![image](https://github.com/gangs8664/Github_User_Content/blob/b95dc3445fcb274c2cf722b53cd71553e8d84d96/ERD.png)

<br />

<div id="7"></div>

<br />

## EC2 포트 정리

| 구분     | 포트번호 |
| -------- | -------- |
| Flask    | 5000     |
| Spring   | 8080     |
| MySQL    | 3306     |

<br />
