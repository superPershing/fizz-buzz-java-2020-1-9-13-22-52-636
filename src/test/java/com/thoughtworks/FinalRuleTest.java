package com.thoughtworks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FinalRuleTest {
    @Test
    public void should_return_Fizz_when_is_multiple_of_3() {
        BaseRule finalRule = new FinalRule(6);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_is_multiple_of_5() {
        BaseRule finalRule = new FinalRule(10);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Whizz_when_is_multiple_of_7() {
        BaseRule finalRule = new FinalRule(14);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_is_multiple_of_3_and_5() {
        BaseRule finalRule = new FinalRule(60);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_is_multiple_of_3_and_7() {
        BaseRule finalRule = new FinalRule(21);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_is_multiple_of_5_and_7() {
        BaseRule finalRule = new FinalRule(140);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_is_multiple_of_3_and_5_and_7() {
        BaseRule finalRule = new FinalRule(105);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_contains_3() {
        BaseRule finalRule = new FinalRule(30);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_contains_5() {
        BaseRule finalRule = new FinalRule(35);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_contains_7() {
        BaseRule finalRule = new FinalRule(75);
        finalRule.check();
        assertThat(finalRule.getResult()).isEqualTo("Fizz");
    }
}