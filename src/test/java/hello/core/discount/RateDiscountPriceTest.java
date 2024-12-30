package hello.core.discount;

import hello.core.Member.Grade;
import hello.core.Member.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPriceTest {

     RateDiscountPolicy rateDiscountPolicy= new RateDiscountPolicy();

    @Test
    @DisplayName("vip는 10%할인이 적용되어야 한다")
    void vip_o(){
        Member member = new Member(1L,"memberA", Grade.VIP);
        int discount = rateDiscountPolicy.discount(member,10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

}