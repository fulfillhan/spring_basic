package hello.core.scan;

import hello.core.AppConfig;
import hello.core.Member.MemberService;
import hello.core.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class AutoAppConfigTest {

    @Test
    void basicScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        //빈으로 등록된 memberService 와 진짜 memberService클래스를 가져와 타입 비교하기
        assertThat(memberService).isInstanceOf(MemberService.class);
    }

}
