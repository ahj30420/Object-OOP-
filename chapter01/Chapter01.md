## Chapter 01: 객체, 설계

### 소프트웨어 모듈의 세 가지 목적 (로버트 마틴)
1. **정확한 동작**: 소프트웨어 모듈은 실행 중에 올바르게 작동해야 한다.
2. **변경 용이성**: 모듈은 변경을 위해 존재한다. 대부분의 모듈은 생명주기 동안 변경되므로, 쉽게 수정할 수 있어야 한다.
3. **이해 용이성**: 코드를 읽는 사람이 쉽게 이해할 수 있어야 한다.

### 의존성(결합도)과 변경
- **의존성**은 변경의 영향을 암시한다. 한 객체가 변경되면, 그 객체에 의존하는 다른 객체도 함께 변경될 수 있다.

### 객체지향 설계 원칙
- 객체를 **인터페이스**와 **구현**으로 나누고, **인터페이스만을 공개**하여 결합도를 낮추고 변경하기 쉬운 코드를 작성하는 것이 중요하다.
- 핵심은 **객체 내부의 상태를 캡슐화**하고, 객체 간에 **메시지를 통해 상호작용**하도록 하는 것이다.

### 응집도와 위임
- 밀접하게 연관된 작업만 수행하고, 관련이 없는 작업은 다른 객체에 위임하는 객체를 **응집도가 높다**고 한다.

### 절차적 프로그래밍과 객체지향 프로그래밍의 차이
- **절차적 프로그래밍**: 프로세스(메서드)와 데이터를 별도의 모듈에 위치시키는 방식.
- **객체지향 프로그래밍**: 프로세스와 데이터를 동일한 모듈에 위치시키고, 객체를 중심으로 프로그래밍하는 방식.
    - 예시: `step01`은 `Theater`의 `enter` 메서드가 프로세스이고, `Audience`, `TicketSeller`, `Bag`, `TicketOffice`는 데이터로서 별도의 모듈에 위치하게 된다. 따라서 `step01`은 절차적 프로그래밍이다.
