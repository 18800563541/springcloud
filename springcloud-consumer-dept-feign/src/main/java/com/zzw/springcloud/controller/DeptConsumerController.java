package com.zzw.springcloud.controller;

import com.zzw.springcloud.pojo.Dept;
import com.zzw.springcloud.service.DeptClientService;
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

    @Autowired
    private DeptClientService service;

    @RequestMapping("/comsumer/dept/add/")
    public boolean add(Dept dept) {
        return this.service.addDept(dept);
    }

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.queryById(id);
    }

    @RequestMapping("/comsumer/dept/list/")
    public List<Dept> list() {
        return  this.service.queryAll();
    }
}
