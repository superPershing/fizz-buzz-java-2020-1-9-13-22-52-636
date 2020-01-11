package com.thoughtworks;

public class FinalRule extends BaseRule {
    private RuleWhenContains7 ruleWhenContains7;

    public FinalRule(int num) {
        super(num);
        ruleWhenContains7 = new RuleWhenContains7(getNum());
    }

    @Override
    public FinalRule check() {
        appendResult(ruleWhenContains7.check().getResult());
        return this;
    }
}
