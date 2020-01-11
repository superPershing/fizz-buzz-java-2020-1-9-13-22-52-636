package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleDivide5Test {
    @Test
    public void should_return_Buzz_when_is_multiple_of_5() {
        BaseRule ruleDivide5 = new RuleDivide5(10);
        ruleDivide5.check();
        assertThat(ruleDivide5.getResult()).isEqualTo("Buzz");
    }
}