package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicRuleTest {

    @Test
    public void should_return_Fizz_when_is_multiple_of_3() {
        BaseRule basicRule = new BasicRule(6);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_is_multiple_of_5() {
        BaseRule basicRule = new BasicRule(10);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Whizz_when_is_multiple_of_7() {
        BaseRule basicRule = new BasicRule(14);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_is_multiple_of_3_and_5() {
        BaseRule basicRule = new BasicRule(60);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_is_multiple_of_3_and_7() {
        BaseRule basicRule = new BasicRule(21);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_is_multiple_of_5_and_7() {
        BaseRule basicRule = new BasicRule(140);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_is_multiple_of_3_and_5_and_7() {
        BaseRule basicRule = new BasicRule(105);
        basicRule.check();
        assertThat(basicRule.getResult()).isEqualTo("FizzBuzzWhizz");

    }
}
