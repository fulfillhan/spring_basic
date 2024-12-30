package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

   /* @Test
    void statefulServiceSinglton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        //빈 조회하기
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);
        
        statefulService1.order("memberA",10000);
        statefulService2.order("memberB",20000);

        int price = statefulService1.getPrice();
        System.out.println("price = " + price);

        //내가 의도한 price = 10000 이지만 결과는 20000
        Assertions.assertThat(statefulService1.getPrice()).isNotEqualTo(10000);

    }
*/
/*    @Test
    void statefulServiceSinglton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        //빈 조회하기
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        int service1Price = statefulService1.order("memberA", 10000);
        int service2Price = statefulService2.order("memberB", 20000);

        //int price = statefulService1.getPrice();
        System.out.println("service1Price = " + service1Price);

        //내가 의도한 price = 10000 이지만 결과는 10000
        Assertions.assertThat(service1Price).isEqualTo(10000);

    }*/


}