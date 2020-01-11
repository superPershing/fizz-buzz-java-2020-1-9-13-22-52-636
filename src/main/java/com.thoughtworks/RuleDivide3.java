package com.thoughtworks;

public class RuleDivide3 extends BaseRule {
    public RuleDivide3(int num) {
        super(num);
    }

    @Override
    public RuleDivide3 check() {
        if (isOpen() && getNum() % 3 == 0) {
            appendResult("Fizz");
        }
        return this;
    }
}
