package com.km.springcloud.service.impl;
/**
 * Created by asus-pc on 2019/6/28.
 */

import com.km.springcloud.dao.DeptDao;
import com.km.springcloud.entities.Dept;
import com.km.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/28 21:36
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
