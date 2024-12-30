package hello.core.order;

import hello.core.Member.Member;
import hello.core.Member.MemberRepository;
import hello.core.Member.MemoryMemberRepository;
import hello.core.discount.DiscountPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    // 추상에도 의존하고, FixDiscountPolicy() 구체적인 것도 함께 의전하는 것 -> DIP(의존역전의 원칙) 위반
    // 구체클래스를 변경할 때 건드려야 하는 상황 발생
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    // RateDiscountPolicy 로 변경해야하는 상황일 경우 결국, OrderServiceImpl 코드를 건드려야 한다.-> OCP(개방 폐쇄의 원칙)위반
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
