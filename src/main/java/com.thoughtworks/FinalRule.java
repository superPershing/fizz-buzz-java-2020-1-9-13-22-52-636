package com.thoughtworks;

public class FinalRule extends BaseRule {
    private RuleWhenContains7 ruleWhenContains7 = new RuleWhenContains7(getNum());
    public FinalRule(int num) {
        super(num);
    }

    @Override
    public Check check() {
        return ruleWhenContains7.check();
    }
}
