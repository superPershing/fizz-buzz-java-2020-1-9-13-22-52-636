package com.thoughtworks;

public class BasicRule extends BaseRule {
    private RuleDivide3 ruleDivide3;
    private RuleDivide5 ruleDivide5;
    private RuleDivide7 ruleDivide7;

    public BasicRule(int num) {
        super(num);
        ruleDivide3 = new RuleDivide3(getNum());
        ruleDivide5 = new RuleDivide5(getNum());
        ruleDivide7 = new RuleDivide7(getNum());
    }

    public RuleDivide3 getRuleDivide3() {
        return ruleDivide3;
    }

    public RuleDivide5 getRuleDivide5() {
        return ruleDivide5;
    }

    public RuleDivide7 getRuleDivide7() {
        return ruleDivide7;
    }

    @Override
    public BasicRule check() {
        if (isClose()) {
            return this;
        }
        appendResult(ruleDivide3.check().getResult());
        appendResult(ruleDivide5.check().getResult());
        appendResult(ruleDivide7.check().getResult());
        return this;
    }
}
