package com.logicore.rest.services.limitservicegit.bean;

public class Limits {

    int minimum;
    int maximum;
    int average;
    String env;

    public Limits() {
    }

    public Limits(int minimum, int maximum, int average, String env) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;
        this.env = env;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }


}
