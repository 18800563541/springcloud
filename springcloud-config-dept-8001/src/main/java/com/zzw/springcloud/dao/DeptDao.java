package com.zzw.springcloud.dao;

import com.zzw.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author zzw
 * @Date 2020/10/22 14:27
 * @Version 1.0
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(Long deptno);

    public List<Dept> queryAll();
}
