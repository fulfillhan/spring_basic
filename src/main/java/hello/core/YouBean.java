package hello.core;

import org.springframework.context.annotation.Bean;

public class YouBean {
     private final Bean1 bean1;

    public YouBean(Bean1 bean1) {
        this.bean1 = bean1;
    }
    //테스트 용도로 추가
    public Bean1 getBean1() {
        return bean1;
    }
}
