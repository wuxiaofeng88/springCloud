package com.km.springcloud;
/**
 * Created by asus-pc on 2019/7/7.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName DeptConsumer_DashBoard_App
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/7 17:23
 * @Version 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }
}
