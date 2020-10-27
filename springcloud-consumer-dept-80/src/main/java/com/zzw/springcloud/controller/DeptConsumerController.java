package com.zzw.springcloud.controller;

import com.zzw.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author zzw
 * @Date 2020/10/22 14:58
 * @Version 1.0
 */
@RestController
public class DeptConsumerController {
    //理解：消费者，不应该有service层~
    //RestTemplate 。。。。供我们直接调用就可以了！ 注册到Spring中

    //(url,实体:Map, Class<T> responseType)
    @Autowired
    private RestTemplate restTemplate; //提供多种便捷访问远程http服务的方法,简单的restful服务模板~

    //Ribbon。这里的地址应该是变量，用过服务名来访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/comsumer/dept/add/")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/comsumer/dept/list/")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list/", List.class);
    }
}
