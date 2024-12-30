package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StatefulPracticeTest {

    /*@Test
    void testStateful() {
        //스프링 컨테이너 생성
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);

        //stateful1와 stateful2 두 스프링 빈은 같다.
        StatefulPractice stateful1 = applicationContext.getBean("statefulPractice", StatefulPractice.class);
        StatefulPractice stateful2 = applicationContext.getBean("statefulPractice", StatefulPractice.class);

        //스레드1 = userA 사용자 접근
        stateful1.order("userA", 1000);

        //스레드2 = userB 사용자 접근
        stateful2.order("userB", 2000);

        int price = stateful1.getPrice();
        System.out.println("price1 = " + price);

    }*/

    @Test
    void testStateless() {
        //스프링 컨테이너 생성
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);

        //stateful1와 stateful2 두 스프링 빈은 같다.
        StatefulPractice stateful1 = applicationContext.getBean("statefulPractice", StatefulPractice.class);
        StatefulPractice stateful2 = applicationContext.getBean("statefulPractice", StatefulPractice.class);

        //스레드1 = userA 사용자 접근
        int userA = stateful1.order("userA", 1000);

        //스레드2 = userB 사용자 접근
        int userB = stateful2.order("userB", 2000);

        Assertions.assertThat(userA).isEqualTo(1000);

    }
    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }

        @Bean
        public StatefulPractice statefulPractice() {
            return new StatefulPractice();
        }
    }
}