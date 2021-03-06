package com.thoughtworks;

public class RuleDivide5 extends BaseRule {
    public RuleDivide5(int num) {
        super(num);
    }

    @Override
    public RuleDivide5 check() {
        if (isOpen() && getNum() % 5 == 0) {
            appendResult("Buzz");
        }
        return this;
    }
}
