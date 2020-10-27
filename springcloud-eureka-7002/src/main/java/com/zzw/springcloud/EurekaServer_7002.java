package com.zzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author zzw
 * @Date 2020/10/23 13:55
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer //服务端启动类。可以接受别人注册进来
public class EurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class,args);
    }
}
