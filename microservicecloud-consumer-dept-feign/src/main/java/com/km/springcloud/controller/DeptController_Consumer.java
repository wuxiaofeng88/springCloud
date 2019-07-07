package com.km.springcloud.controller;
/**
 * Created by asus-pc on 2019/6/29.
 */

import com.km.springcloud.entities.Dept;
import com.km.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName DeptController_Consumer
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/29 9:23
 * @Version 1.0
 **/
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id){
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptClientService.list();
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }
}
