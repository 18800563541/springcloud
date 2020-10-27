package com.zzw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zzw
 * @Date 2020/10/23 16:40
 * @Version 1.0
 */
@Configuration
public class ZzwRule {

    //自定义负载均衡策略
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
//        return new ZzwRandomRule();//自定义为ZzwRandomRule
    }

}
