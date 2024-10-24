package chapter08.dependency;

import java.time.Duration;

public class Main {
    public static void main(String[] args){

        /**
         * 1. 생성자 주입
         */
        Movie movie1 = new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000), new AmountDiscountPolicy());

        /**
         * 2. Setter 주입
         * 장점: 실행 시점에 의존 대상을 변경 할 수 있어 설계를 유연하게 만들어준다.
         * 단점: 객체를 생성하고 의존 대상을 설정하기 전까지 객체의 상태가 불완전할 수 있다.
         * 생성자 주입과 같이 사용하는 것을 추천한다.
         */
        movie1.setDiscountPolicy(new AmountDiscountPolicy());

        /**
         * 3. 메서드 주입
         * 사용되는 경우: 지속적으로 의존 관계 없이 일시적으로만 관계를 맺으면 되는 경우,
         *              메서드 실행마다 의존 대상이 매번 달라지는 경우
         * 대부분의 경우에 매번 동일한 객체를 인자로 전달하고 있다면 생성자, setter 주입을 사용하는게 좋다.
         */
        movie1.calculateMovieFee(new Screening(), new AmountDiscountPolicy());
    }
}
