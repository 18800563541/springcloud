package com.zzw.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zzw
 * @Date 2020/10/22 13:53
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable { //Dept 实体类，orm 类表关系映射
    private Long deptno;//主键
    private String dname;

    //这个数据是存在哪个数据库的字段~ 微服务，一个服务对应一个数据库，用一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }

    /*
    链式写法：
        Dept dept = new Dept();
        dept.setDeptNo(11).setDname('sss').setDb_source('001')
     */
}
