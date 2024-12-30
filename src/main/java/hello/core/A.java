package hello.core;

public class A {
    private B bValue;

    public A(B bValue) {
        this.bValue = bValue; //인터페이스를 통한 의존성 주입
    }

    public void start() {
        bValue.start();
    }


    public interface B {
        void start(); //추상 메서드
    }

    static class b1 implements B {

        //직접 메서드 구현
        @Override
        public void start() {
            System.out.println("b1 클래스 시작!");
        }
    }

    static class b2 implements B {

        @Override
        public void start() {
            System.out.println("b2 클래스 시작!");
        }
    }

}
