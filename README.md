# **[Spring_4기] CH 2 계산기 과제**

## 🧮 Lv1 계산기
클래스 없이 기본적인 연산을 수행하는 계산기를 구현합니다.

---

### 🛠️ **과제 흐름** 🛠️
1. **양의 정수(0 포함) 두 개 입력받기**
2. **사칙연산 기호(➕➖✖️➗) 입력받기**
3. **입력받은 정수와 연산 기호를 활용하여 결과값 출력**
4. **반복문 사용**
   - 종료 명령어: `"exit"`
   - `"exit"` 입력 전까지 무한 반복 수행

---

### ✅ **구현 완료**

### 🤔 **고민했던 부분**
1. **`exit` 명령어 위치**
   - 반복문 **시작**에서 종료 여부를 입력받을지, **마지막**에서 입력받을지 고민.  
   - **해결:**  
     반복문의 **마지막**에서 종료 여부를 입력받는 방식이 사용자 경험과 코드 흐름에 더 적합하다고 판단하여 적용.  

### 🫠 **어려웠던 부분**
1. **`charAt(0)` 활용 방법**
   - 초기에는 문자열을 받아 `.equals()` 메서드를 사용하여 조건문 작성.  
   - 과제 지침에 따라 `charAt(0)`을 활용하여 코드를 간결화.  
   - **해결:**  
     - `next().charAt(0)`으로 연산 기호를 처리하도록 수정.  

---

## 🧮 Lv2 계산기
클래스를 활용하여 연산을 수행하고 결과를 관리하는 계산기를 구현합니다.

---

### 🛠️ **과제 흐름** 🛠️
1. **사칙연산 수행 후 결과값 반환 메서드 구현**
2. **연산 결과 저장을 위한 컬렉션 필드를 가진 `Calculator` 클래스 생성**
3. **`App` 클래스의 `main` 메서드에서 `Calculator` 클래스를 활용하도록 수정**
4. **캡슐화를 통해 `App` 클래스에서 컬렉션 필드에 직접 접근 금지**
5. **저장된 연산 결과 중 가장 먼저 저장된 데이터를 삭제하는 메서드 구현**
6. **삭제 메서드를 `App` 클래스의 `main` 메서드에서 활용하도록 수정**

---

### 🛠️ **주요 기능**
1. **사칙연산 수행 및 결과값 반환 메서드 (`operate`)**
2. **연산 결과 저장**
   - `Calculator` 클래스 내 컬렉션 필드(큐)를 활용하여 연산 결과 저장.
3. **결과 관리 메서드 추가**
   - **`addQueue` 메서드:** 연산 결과를 큐에 저장.
   - **`checkQueue` 메서드:** 저장된 연산 결과를 확인.
   - **`pollQueue` 메서드:** 가장 먼저 저장된 데이터를 삭제.
4. **캡슐화를 통한 데이터 접근 보호**
   - `App` 클래스에서 큐 필드에 직접 접근 불가.

---

### ✅ **구현 완료**

### 🤔 **고민했던 부분**
1. **`getter`와 `setter`의 사용 위치**
   - 연산 결과를 저장 및 조회하는 위치를 고민.  
   - **해결:**  
     - `operate` 메서드 실행 직후 결과 저장(`setter` 메서드).  
     - 결과 삭제나 변경 후에는 현재 상태를 출력하도록 설계(`getter` 메서).  

2. **예외 처리 (적용하지 못하고 고려만 함)**
   - **분모가 0인 경우:** 나눗셈 연산 시 예외 발생 방지를 위해 조건문으로 처리.  
   - **잘못된 입력 값:** 숫자 대신 다른 타입 입력 시 예외 처리 가능 여부 검토.  
   - **잘못된 연산자 입력:** 지원하지 않는 연산 기호 입력 시 예외 처리 방법 고민.

---

### 🫠 **어려웠던 부분**
1. **컬렉션 필드 적용**
   - 초기에는 `App` 클래스와 `Calculator` 클래스에 각각 큐를 선언 및 관리.  
   - 자바 세션을 통해 **컬렉션의 선언 및 초기화**를 한 곳으로 통합하는 방법을 배우고 수정.  
   - **해결:**  
     - `Calculator` 클래스에 큐를 선언하고 관리.  
     - `App` 클래스에서는 캡슐화된 메서드로 큐 데이터를 조작.

---

### 📋 **전체 파일 구조**
```plaintext
├── CalculatorLv1.java    # Lv1 계산기 (클래스 없이 구현)
├── App.java              # 메인 클래스 (Lv2 계산기)
├── Calculator.java       # Lv2 계산기 (클래스 기반 기능 구현)
├── README.md             # 프로젝트 설명 파일
```

---

이처럼 Lv1에서 시작하여 Lv2로 발전시키며 코드의 구조적 설계와 사용자 경험을 지속적으로 개선할 수 있었습니다. 🛠️
