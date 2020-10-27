package com.atguigu.springcloud;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:EurekaMain7001
 * Package:com.atguigu.springcloud
 * Description:
 *
 * @date:2020/10/26 4:45 下午
 * @author:liuguoliang
 */
@SpringBootApplication
@EnableEurekaServer    //Enable---启用     注解指出这是注册中心
public class EurekaMain7001 {
    public static void main(String[] args) {

        SpringApplication.run(EurekaMain7001.class,args);
    }
}
