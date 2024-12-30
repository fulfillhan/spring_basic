package hello.core;

import hello.core.Member.MemberRepository;
import hello.core.Member.MemberSerivceImpl;
import hello.core.Member.MemberService;
import hello.core.Member.MemoryMemberRepository;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberSerivceImpl(memberRepositry(), discountPolicy());
        //MemberService 호출하면 MemoryMemberRepository 객체를 생성해서 해당 참조값을 복사해서  MemberSerivceImpl 생성자의 매개변수에
        //넣어준다. MemberRepository와 MemoryMemberRepository 같은 참조값을 가리킨다.
    }

    @Bean
    public static MemberRepository memberRepositry() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepositry(), discountPolicy());  //역할을 세운다
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();  //구현을 한다
        return new RateDiscountPolicy();  // 할인 정책을 변경해도 appCong에서만 변경하면 됨.
    }

}
