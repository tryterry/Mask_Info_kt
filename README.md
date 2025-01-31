
# 📱 MaskInfo

## 📢 소개
**Maskinfo**는 공적 마스크 조회 API 서비스를 연동하여 지역별 마스크의 재고 현황을 확인할 수 있는 애플리케이션입니다.


*공적 마스크 조회 API의 서비스가 종료되어 백업용 URL을 통해 데이터 조회*

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
```bash
git clone https://github.com/tryterry/Mask_Info_kt.git
cd Mask_Info_kt
