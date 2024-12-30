package hello.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackageClasses = AutoAppConfig.class,
        basePackages = "hello.core", // 패키지 시작 위치 지정 가능하다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class))
public class AutoAppConfig {

    //@Configuration 하나이상의 @Bean 메서드가 있으면 스프링 컨테이너에 등록해줌
    //@ComponentScan Configuration이 붙은 설정 정보 자동으로 등록하고 실행시킴
    // @Component 클래스를 스캔해서 스프링 빈으로 등록한다.

}
