package com.zzw.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zzw
 * @Date 2020/10/22 15:02
 * @Version 1.0
 */
@Configuration
public class ConfigBean { //@Configuration 相当于在 spring  applicationContext.xml 配置Bean

    //配置负载均衡实现RestTemplate
    //IRule
    //AvailabilityFilteringRule：先过滤掉，跳闸，访问故障的服务~，对剩下的进行轮询
    //RoundRobinRule：轮询，默认
    //RandomRule：随机
    //RetryRule：会先按轮询获取服务，如果服务获取失败，则会在指定时间内重试~
    @Bean
    @LoadBalanced //Rabbin
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
