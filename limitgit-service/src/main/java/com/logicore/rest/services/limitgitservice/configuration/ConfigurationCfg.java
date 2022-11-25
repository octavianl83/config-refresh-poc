package com.logicore.rest.services.limitgitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "limitsgit-service-cfg")
@Component
public class ConfigurationCfg {
    private int refresh;
    private int timeout;
    private String persistence;
    private String env;

    public ConfigurationCfg() {
    }

    public ConfigurationCfg(int refresh, int timeout, String persistence, String env) {
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
