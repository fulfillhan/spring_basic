package hello.core;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBean {
   private final Bean1 bean1;

    public MyBean(Bean1 bean1) {
        this.bean1 = bean1;
    }

    //테스트 용도로 추가
    public Bean1 getBean1() {
        return bean1;
    }
}
