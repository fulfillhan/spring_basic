package hello.core.Member;

import hello.core.discount.DiscountPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberSerivceImpl implements MemberService{

    //문제점: 추상화에도 의존하고, 구체화에도 의존한다. DIP 위반
    private final MemberRepository memberRepository;

    @Autowired
    private final DiscountPolicy discountPolicy;
   //-> 인터페이스만 의존하게 된다.
    public MemberSerivceImpl(MemberRepository memberRepository,DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
