package com.thoughtworks;

public class RuleWhenContains5 extends BaseRule {
    private RuleWhenContains3 ruleWhenContains3 = new RuleWhenContains3(getNum());
    public RuleWhenContains5(int num) {
        super(num);
    }

    public RuleWhenContains3 getRuleWhenContains3() {
        return ruleWhenContains3;
    }

    @Override
    public RuleWhenContains5 check() {
        if (isOpen() && String.valueOf(getNum()).contains("5")) {
            ruleWhenContains3.setOpen(false);
            ruleWhenContains3.getBasicRule().getRuleDivide3().setOpen(false);
        }
        appendResult(ruleWhenContains3.check().getResult());
        return this;
    }
}
