package com.thoughtworks;

public class RuleDivide7 extends BaseRule {
    public RuleDivide7(int num) {
        super(num);
    }

    @Override
    public RuleDivide7 check() {
        if (isOpen() && getNum() % 7 == 0) {
            appendResult("Whizz");
        }
        return this;
    }
}
