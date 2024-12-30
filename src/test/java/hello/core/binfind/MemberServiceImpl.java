package hello.core.binfind;

import hello.core.Member.Member;
import hello.core.Member.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Override
    public void join(Member member) {
        //로직
    }

    @Override
    public Member findMember(Long memberId) {
        return null;
    }
}
