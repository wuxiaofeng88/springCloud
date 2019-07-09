package com.km.springcloud;
/**
 * Created by asus-pc on 2019/7/8.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName Config_3344_StartSpringCloudApp
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/8 20:46
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
    }
}
