package com.logicore.rest.services.limitgitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "limitsgit-service-db")
@Component
public class ConfigurationDb {
    private String username;
    private String password;
    private String ip;
    private int port;
    private String env;

    public ConfigurationDb() {
    }

    public ConfigurationDb(String username, String password, String ip, int port, String env) {
        this.username = username;
        this.password = password;
        this.ip = ip;
        this.port = port;
        this.env = env;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
