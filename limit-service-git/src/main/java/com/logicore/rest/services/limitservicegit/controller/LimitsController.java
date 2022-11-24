package com.logicore.rest.services.limitservicegit.controller;


import com.logicore.rest.services.limitservicegit.bean.Limits;
import com.logicore.rest.services.limitservicegit.bean.LimitsCfg;
import com.logicore.rest.services.limitservicegit.bean.LimitsDb;
import com.logicore.rest.services.limitservicegit.configuration.Configuration;
import com.logicore.rest.services.limitservicegit.configuration.ConfigurationCfg;
import com.logicore.rest.services.limitservicegit.configuration.ConfigurationDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @Autowired
    private ConfigurationDb configurationDb;

    @Autowired
    private ConfigurationCfg configurationCfg;

    @GetMapping("/limits")
    public Limits retreiveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum(),
                configuration.getAverage(), configuration.getEnv());

    }

    @GetMapping("/limits-db")
    public LimitsDb retreiveLimitsDb() {
        return new LimitsDb(configurationDb.getUsername(), configurationDb.getPassword(),
                configurationDb.getIp(), configurationDb.getPort(), configurationDb.getEnv());
    }

    @GetMapping("/limits-cfg")
    public LimitsCfg retreiveLimitsCfg() {
        return new LimitsCfg(configurationCfg.getRefresh(), configurationCfg.getTimeout(),
                configurationCfg.getPersistence(), configurationCfg.getEnv());
    }
}
