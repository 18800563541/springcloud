package com.zzw.springcloud.service;

import com.zzw.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author zzw
 * @Date 2020/10/22 14:34
 * @Version 1.0
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}
