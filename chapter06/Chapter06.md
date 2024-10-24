# Chapter 06: 메시지와 인터페이스

## 메시지
메시지: 객체들이 협력하기 위해 사용할 수 있는 유일한 의사소통 수단이다.
- 메시지 전송 = 메시지 수진자.오퍼레이션명(인자)

## 메서드
메서드: 메시지를 수신했을 때 실제로 실행되는 함수 또는 프로시저

## 퍼블릭 인터페이스의 품질에 영향을 미치는 원칙
1. **디미터 법칙**
    - "낯선 자에게 말하지 말라", "오직 인접한 이웃하고만 말하라", "오직 하나의 도트만 사용하라"


2. **묻지 말고 시켜라**
    - 절차적인 코드는 정보를 얻은 후에 결정한다. 객체지향 코드는 객체에게 그것을 하도록 시킨다.

3. **의도를 드러내는 인터페이스**
    - 메서드의 이름을 지을때는 "어떻게"가 아니라 "무엇"을 하는지를 드러내야 한다.

4. **명령-쿼리 분리 원칙**
    - 명령: 부수효과를 발생시킬 수 있지만 값을 반환할 수 없다.
    - 쿼리: 값을 반환할 수 있지만 부수효과를 발생시킬 수 없다.
