package com.zzw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zzw
 * @Date 2020/10/26 15:22
 * @Version 1.0
 */
@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        return "applicationName:" + applicationName + "eurekaServer:" + eurekaServer + "port:" + port;
    }

}
