package hello.core.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private Map<Long,Member> store = new HashMap<>();// hashMap 동시성의 이슈가 있지만 테스트이니깐 일단 사용

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
