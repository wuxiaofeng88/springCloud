package com.km.springcloud;
/**
 * Created by asus-pc on 2019/6/29.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServer7001_APP
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/29 17:09
 * @Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7003_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_APP.class, args);
    }
}
