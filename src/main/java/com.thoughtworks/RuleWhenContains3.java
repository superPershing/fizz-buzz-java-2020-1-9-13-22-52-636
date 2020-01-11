package com.thoughtworks;

public class RuleWhenContains3 extends BaseRule {
    private BasicRule basicRule;

    public RuleWhenContains3(int num) {
        super(num);
        basicRule = new BasicRule(getNum());
    }

    public BasicRule getBasicRule() {
        return basicRule;
    }

    @Override
    public RuleWhenContains3 check() {
        if (isOpen() && String.valueOf(getNum()).contains("3")) {
            basicRule.setOpen(false);
            appendResult("Fizz");
        }
        appendResult(basicRule.check().getResult());
        return this;
    }
}
