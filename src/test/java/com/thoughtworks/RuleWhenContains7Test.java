package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleWhenContains7Test {
    @Test
    public void should_return_Fizz_when_contains_5() {
        BaseRule ruleWhenContains7 = new RuleWhenContains7(75);
        ruleWhenContains7.check();
        assertThat(ruleWhenContains7.getResult()).isEqualTo("Fizz");
    }
}