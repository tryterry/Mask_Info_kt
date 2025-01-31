# 📱 MaskInfo

## 📢 소개
- **Maskinfo**는 공적 마스크 조회 API 서비스를 연동하여 지역별 마스크의 재고 현황을 확인할 수 있는 애플리케이션입니다.

- 본 프로젝트는 **[모던 안드로이드 - 코틀린과 Jetpack 활용](https://www.inflearn.com/course/%EB%AA%A8%EB%8D%98-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%BD%94%ED%8B%80%EB%A6%B0-%EC%A0%9C%ED%8A%B8%ED%8C%A9#curriculum)** 인프런 강의 내용을 학습하여 제작한 토이프로젝트입니다.

*공적 마스크 조회 API의 서비스가 종료되어 백업용 URL을 통해 데이터를 조회합니다.*

## 🎯 주요 기능
- 🔹 **위치 정보 수집**: 현재 위치 정보 수집
- 📊 **병원별 마스크 현황 조회**: 현재 위치 기반 주변 병원의 마스크 현황 조회

## 🛠️ 기술 스택
- **언어**: Kotlin
- **DI**: Hilt
- **아키텍처**: MVVM
- **네트워크 통신**: Retrofit
- **로컬 데이터 저장**: Room Database
- **바인딩**: LiveData, DataBinding

## 📥 설치 방법
### 1️⃣ 클론 및 프로젝트 설정
~~~bash
git clone https://github.com/tryterry/Mask_Info_kt.git
cd Mask_Info_kt
~~~

### 2️⃣ 필요한 환경 설정
- Android Studio 설치

### 3️⃣ 빌드 및 실행
1. Android Studio에서 프로젝트를 엽니다.
2. 필요한 SDK 및 의존성을 설치합니다.
3. USB 디버깅이 활성화된 Android 기기를 연결합니다.
4. Run 버튼을 눌러 실행합니다.

