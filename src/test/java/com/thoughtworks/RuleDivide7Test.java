package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleDivide7Test {
    @Test
    public void should_return_Whizz_when_is_multiple_of_7() {
        BaseRule ruleDivide7 = new RuleDivide7(14);
        ruleDivide7.check();
        assertThat(ruleDivide7.getResult()).isEqualTo("Whizz");
    }
}