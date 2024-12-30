package hello.core;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppConfigTest {

    @Test
    public void myBeanTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfiguration.class);
        AppConfiguration bean = ac.getBean(AppConfiguration.class);
        System.out.println("bean = " + bean);



/*        MyBean myBean = ac.getBean("myBean", MyBean.class);
        YouBean youBean = ac.getBean("youBean", YouBean.class);
        Bean1 bean1 = ac.getBean("bean1", Bean1.class);

        Bean1 myBean1 = myBean.getBean1();
        Bean1 youBean1 = youBean.getBean1();

        System.out.println("bean1 = " + bean1);
        System.out.println("myBean1 = " + myBean1);
        System.out.println("youBean1 = " + youBean1);

        Assertions.assertThat(myBean1).isSameAs(youBean1);*/

    }

    @Configuration
    static class AppConfiguration{
        @Bean
        public MyBean myBean(){
            return new MyBean(bean1());
        }
        @Bean
        public YouBean youBean(){
            return new YouBean(bean1());
        }
        @Bean
        public Bean1 bean1(){
            return new Bean1();
        }
    }

}