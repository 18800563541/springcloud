package com.zzw.springcloud;

import com.zzw.myrule.ZzwRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author zzw
 * @Date 2020/10/22 15:29
 * @Version 1.0
 */
//Ribbon 和Eureka 整合以后，客户端可以直接调用，不用关系端口号
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候，就能去加载我们自定义的Ribbon类，默认在RestTemplate配置
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = ZzwRule.class)
public class DeptComsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptComsumer_80.class, args);
    }
}
