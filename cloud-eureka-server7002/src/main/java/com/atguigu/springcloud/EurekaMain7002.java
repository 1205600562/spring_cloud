package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName:EurekaMain7002
 * Package:com.atguigu.springcloud
 * Description:
 *
 * @date:2020/10/27 10:44 上午
 * @author:liuguoliang
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
