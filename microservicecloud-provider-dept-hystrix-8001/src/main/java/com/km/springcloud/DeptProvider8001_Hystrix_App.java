package com.km.springcloud;
/**
 * Created by asus-pc on 2019/6/28.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName DeptProvider8001_App
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/28 21:49
 * @Version 1.0
 **/
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker //对hystrix熔断机制的支持
public class DeptProvider8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
