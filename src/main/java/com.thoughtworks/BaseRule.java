package com.thoughtworks;

public abstract class BaseRule implements Check {
    private boolean open;
    private int num;
    private String result;

    public BaseRule(int num) {
        this.num = num;
        this.open = true;
        this.result = "";
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return !isOpen();
    }

    public int getNum() {
        return num;
    }

    public String getResult() {
        return result;
    }

    public void appendResult(String temp) {
        result += temp;
    }
}
