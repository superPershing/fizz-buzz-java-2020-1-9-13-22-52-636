package com.thoughtworks;

public class FinalRule extends BaseRule {
    private RuleWhenContains7 ruleWhenContains7 = new RuleWhenContains7(getNum());

    public FinalRule(int num) {
        super(num);
    }

    @Override
    public FinalRule check() {
        appendResult(ruleWhenContains7.check().getResult());
        return this;
    }
}
