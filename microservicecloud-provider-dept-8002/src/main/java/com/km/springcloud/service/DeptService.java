package com.km.springcloud.service;

import com.km.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by asus-pc on 2019/6/28.
 */
public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
