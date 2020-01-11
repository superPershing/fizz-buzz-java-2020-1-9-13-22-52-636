package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleDivide3Test {
    @Test
    public void should_return_Fizz_when_is_multiple_of_3() {
        BaseRule ruleDivide3 = new RuleDivide3(6);
        ruleDivide3.check();
        assertThat(ruleDivide3.getResult()).isEqualTo("Fizz");
    }
}