package hello.core.Member;



import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

     MemberService memberService;

    @BeforeEach// 각 테스트 실행전에 무조건 실행되는 것
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
         //memberService = appConfig.memberService();
    }

    @Test
    void join(){
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }
}
