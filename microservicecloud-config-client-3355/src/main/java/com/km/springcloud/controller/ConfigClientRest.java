package com.km.springcloud.controller;
/**
 * Created by asus-pc on 2019/7/9.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientRest
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/9 20:34
 * @Version 1.0
 **/
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        return "applicationName: " + applicationName + ",\teurekaServers: " + eurekaServers + ",\tport: " + port;
    }
}
