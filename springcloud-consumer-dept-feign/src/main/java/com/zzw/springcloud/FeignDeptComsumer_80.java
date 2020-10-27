package com.zzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author zzw
 * @Date 2020/10/22 15:29
 * @Version 1.0
 */
//Ribbon 和Eureka 整合以后，客户端可以直接调用，不用关系端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zzw.springcloud"})
@ComponentScan("com.zzw.springcloud")
public class FeignDeptComsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptComsumer_80.class, args);
    }
}
