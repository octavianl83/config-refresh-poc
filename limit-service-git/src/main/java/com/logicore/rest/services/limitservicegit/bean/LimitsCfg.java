package com.logicore.rest.services.limitservicegit.bean;

public class LimitsCfg {

    private int refresh;
    private int timeout;
    private String persistence;
    private String env;

    public LimitsCfg() {
    }

    public LimitsCfg(int refresh, int timeout, String persistence, String env) {
        this.refresh = refresh;
        this.timeout = timeout;
        this.persistence = persistence;
        this.env = env;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getPersistence() {
        return persistence;
    }

    public void setPersistence(String persistence) {
        this.persistence = persistence;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
