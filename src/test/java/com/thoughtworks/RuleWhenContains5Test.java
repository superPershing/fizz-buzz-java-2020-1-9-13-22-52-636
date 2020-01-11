package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleWhenContains5Test {
    @Test
    public void should_return_Fizz_when_contains_5() {
        BaseRule ruleWhenContains5 = new RuleWhenContains5(35);
        ruleWhenContains5.check();
        assertThat(ruleWhenContains5.getResult()).isEqualTo("BuzzWhizz");
    }
}