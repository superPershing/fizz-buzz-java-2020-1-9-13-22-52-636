package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RuleWhenContains3Test {
    @Test
    public void should_return_Fizz_when_contains_3() {
        BaseRule ruleWhenContains3 = new RuleWhenContains3(30);
        ruleWhenContains3.check();
        assertThat(ruleWhenContains3.getResult()).isEqualTo("Fizz");
    }
}