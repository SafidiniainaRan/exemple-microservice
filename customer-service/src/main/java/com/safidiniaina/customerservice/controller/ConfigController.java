package com.safidiniaina.customerservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safidiniaina.customerservice.model.ConfigParams;

@RestController
@RefreshScope
@RequestMapping(value ="/customerConfig")
public class ConfigController {
    
    @Value("${global.param.x}")
    int x;
    @Value("${global.param.y}")
    int y;

    private ConfigParams configParams;

    ConfigController(ConfigParams configParams){
        this.configParams = configParams;
    }

    @GetMapping("global")
    public ConfigParams globalConfig(){
        return configParams;
    }

    @GetMapping("specific")
    public Map<String, Object> getSpecific(){
        return Map.of("x",x,"y",y);
    }

}
