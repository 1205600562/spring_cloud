package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:ApplicationContextConfig
 * Package:com.atguigu.springcloud.config
 * Description:
 *
 * @date:2020/10/25 11:23 下午
 * @author:liuguoliang
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}