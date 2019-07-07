package com.km.springcloud;
/**
 * Created by asus-pc on 2019/7/7.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName Zuul_9527_StartSpringCloudApp
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/7 19:42
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp
{
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
