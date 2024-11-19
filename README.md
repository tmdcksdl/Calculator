# **[Spring_4기] CH 2 계산기 과제**

## 🧮 Lv1 계산기
클래스 없이 기본적인 연산을 수행할 수 있는 계산기를 만듭니다.

**⭐ 모두 구현 완료 ⭐**

### 🛠 주요 기능
- **양의 정수(0 포함) 2개 입력받기**  
- **사칙연산 기호(+, -, *, /) 입력받기**  
- **입력받은 정수와 연산 기호로 연산 후 결과값 출력**  
- **반복문 사용 (종료 명령어: `exit`)**  
  - `"exit"` 입력 전까지 무한 반복 수행

---

### 🤔 고민했던 부분
1. **`exit` 입력 위치**  
   - 반복문 **시작**에서 입력받을지, **끝**에서 입력받을지 고민.  
   - 코드 실행 결과, **반복문의 끝**에서 입력받는 방식이 더 효율적이라 판단하여 적용.

---

### 🫠 어려웠던 부분
1. **`charAt(0)` 활용 방법**  
   - 기존에는 문자열을 받아 `.equals()` 메서드를 이용해 조건문을 작성.  
   - 과제 설명에서 `charAt(0)` 사용을 권장하여, 이를 활용하는 방법을 고민.  
   - 해결:
     - `next().charAt(0)`으로 입력을 받아 조건문 작성.  
     - 코드를 간결하게 구성할 수 있었음.

---

## 🧮 Lv2 계산기
클래스를 적용하여 기본적인 연산을 수행할 수 있는 계산기를 만듭니다.

**⭐ 모두 구현 완료 ⭐**

### 🛠 주요 기능
- **사칙연산 수행 후 결과값 반환 메서드 구현**  
- **연산 결과 저장을 위한 컬렉션 필드를 가진 `Calculator` 클래스 생성**  
- **`App` 클래스의 `main` 메서드에서 `Calculator` 클래스를 활용하도록 수정**  
- **캡슐화를 통해 `App` 클래스에서 컬렉션 필드에 직접 접근 금지**  
- **저장된 연산 결과 중 가장 먼저 저장된 데이터를 삭제하는 메서드 구현**  
- **삭제 메서드를 `App` 클래스의 `main` 메서드에서 활용하도록 수정**

---

### 🤔 고민했던 부분
1. **`getter`와 `setter` 사용 위치**  
   - 연산 결과를 어디서 저장하고, 불러와야 할지 헷갈림.  
   - 해결:
     - 연산 결과는 **사칙연산 직후** 저장(`setter` 메서드).  
     - 데이터를 **삭제하거나 변경한 후** 현재 데이터를 출력하도록 설계(`getter` 메서드).

---

### 🫠 어려웠던 부분
1. **컬렉션 타입 필드 적용**  
   - 초기에는 `App` 클래스와 `Calculator` 클래스에 각각 큐를 선언 및 초기화.  
   - 이후 자바 세션(객체 활용 기초)을 통해 **컬렉션 선언 및 초기화 방법**을 정확히 이해하고 수정.  

---

## 📋 전체 파일 구조
```plaintext
├── CalculatorLv1.java    # Lv1 계산기
├── App.java              # 메인 클래스 (Lv2 계산기)
├── Calculator.java      # Lv2 계산기
├── README.md       # 프로젝트 설명 파일
```
