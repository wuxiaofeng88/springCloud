package com.km.springcloud.cfgbeans;
/**
 * Created by asus-pc on 2019/6/29.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConfigBean
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/29 9:18
 * @Version 1.0
 **/
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
