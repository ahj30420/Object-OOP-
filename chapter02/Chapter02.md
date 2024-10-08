## Chapter 02: 객체지향 프로그래밍

### 객체지향 프로그래밍의 두 가지 핵심 원칙
1. **객체 우선**: 어떤 클래스를 만들지 고민하기 전에, **어떤 객체들이 필요한지**를 먼저 고민해야 한다.
2. **객체의 협력**: 객체를 **독립적인 존재**로 보기보다는 **기능을 협력하여 구현하는 공동체의 일원**으로 보아야 한다.

### 자율적인 객체
1. 객체는 **상태**와 **행동**을 함께 가지는 **복합적인 존재**이다.
2. 객체는 **스스로 판단**하고 **행동하는 자율적인 존재**이다.

### 캡슐화와 접근 제어
- **퍼블릭 인터페이스**: 외부에서 접근 가능한 부분 (public)
- **구현**: 외부에서 접근 불가능하고 내부에서만 접근 가능한 부분 (private, protected)

### 프로그래머의 역할
1. **클래스 작성자**: 새로운 데이터 타입을 추가하는 역할.
2. **클라이언트 프로그래머**: 클래스 작성자가 추가한 데이터 타입을 사용해 애플리케이션을 구축하는 역할.

### 구현 은닉
- **구현 은닉**은 클래스 작성자가 클라이언트 프로그래머가 접근할 수 없는 부분을 숨김으로써, **내부 구현을 자유롭게 변경**할 수 있게 한다.
- **외부와 내부**를 명확히 구분하면 클라이언트 프로그래머가 알아야 할 지식이 줄어들고, 클래스 작성자의 **구현 변경 자유도**가 높아진다.

### 코드 의존성과 실행 시점 의존성
- **코드 의존성**(컴파일 시간 의존성)과 **실행 시점 의존성**(실행 시간 의존성)은 서로 다를 수 있다.
- **유연하고 재사용 가능한 설계**는 코드 의존성과 실행 시점 의존성의 차이에 의해 가능해진다.
- 그러나, 이 차이가 커질수록 코드를 이해하기 어려워진다는 **트레이드오프**가 존재한다.

### 다형성과 바인딩
- **다형성**: 동일한 메시지를 전송해도, 실제로 어떤 메서드가 실행될지는 **수신 객체의 클래스**에 따라 달라진다. 이는 컴파일 시간과 실행 시간 의존성을 다르게 만든다.
- **동적 바인딩**(지연 바인딩): 메시지와 메서드를 **실행 시점에 바인딩**하는 것.
- **정적 바인딩**(초기 바인딩): **컴파일 시점에 실행할 메서드**가 결정되는 것.

### 상속의 단점
1. **캡슐화를 위반**할 수 있다.
2. **설계의 유연성을 저해**한다 (부모-자식 클래스의 관계가 컴파일 시점에 결정됨).

### 합성 vs 상속
- **상속**: 클래스를 통해 강하게 결합됨.
- **합성**: 메시지를 통해 느슨하게 결합됨.
- **코드 재사용**을 위해서는 **상속보다 합성**이 더 유연하지만, **다형성**을 위해서는 **상속과 합성을 조합**해서 사용할 수 있다.

