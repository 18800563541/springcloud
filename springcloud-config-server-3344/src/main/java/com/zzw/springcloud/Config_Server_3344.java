package com.zzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author zzw
 * @Date 2020/10/26 14:54
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class Config_Server_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class,args);
    }
}
