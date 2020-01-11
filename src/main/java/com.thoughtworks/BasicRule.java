package com.thoughtworks;

public class BasicRule extends BaseRule {
    private RuleDivide3 ruleDivide3 = new RuleDivide3(getNum());
    private RuleDivide5 ruleDivide5 = new RuleDivide5(getNum());
    private RuleDivide7 ruleDivide7 = new RuleDivide7(getNum());
    public BasicRule(int num) {
        super(num);
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
