package com.thoughtworks;

public abstract class BaseRule implements Check{
    private boolean open = true;
    private int num;
    private String result = "";

    public BaseRule(int num) {
        this.num = num;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClose() {
        return !isOpen();
    }

    public void setOpen(boolean open) {
        this.open = open;
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
