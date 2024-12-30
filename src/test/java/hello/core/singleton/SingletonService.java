package hello.core.singleton;


public class SingletonService {
    //1. static 영역에 객체를 한개만 생성하기 위해 하나만 참조한다.(static 영역은 공유한다.)
    private static   SingletonService instance = new SingletonService();

    //public 으로 열어두어 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    //  하나의 인스턴스만 반환한다.
    public static SingletonService getInstance(){
        return instance;
    }

    //3. 생성자를 private로 선언해서 외부에서 새로운 객체 생성을 막아야 한다.(유지보수를 위해서)
    private SingletonService(){

    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
