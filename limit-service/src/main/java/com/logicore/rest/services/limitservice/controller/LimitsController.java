package com.logicore.rest.services.limitservice.controller;

import com.logicore.rest.services.limitservice.bean.Limits;
import com.logicore.rest.services.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retreiveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum(),
                configuration.getAverage(), configuration.getEnv());

    }
}
