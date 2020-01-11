package com.thoughtworks;

public class RuleWhenContains7 extends BaseRule {
    private RuleWhenContains5 ruleWhenContains5 = new RuleWhenContains5(getNum());
    public RuleWhenContains7(int num) {
        super(num);
    }

    @Override
    public Check check() {
        if (isOpen() && String.valueOf(getNum()).contains("7")) {
            ruleWhenContains5.setOpen(false);
            ruleWhenContains5.getRuleWhenContains3().getBasicRule().getRuleDivide5().setOpen(false);
        }
        appendResult(ruleWhenContains5.check().getResult());
        return this;
    }
}
