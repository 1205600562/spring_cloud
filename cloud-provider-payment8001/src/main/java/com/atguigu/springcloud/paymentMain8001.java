package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * ClassName:paymentMain8001
 * Package:
 * Description:
 *
 * @date:2020/3/23 9:59 下午
 * @author:liuguoliang
 */
@SpringBootApplication
@EnableEurekaClient
public class paymentMain8001 {
    public static void main(String[] args)  {
        SpringApplication.run(paymentMain8001.class,args);
    }
}
