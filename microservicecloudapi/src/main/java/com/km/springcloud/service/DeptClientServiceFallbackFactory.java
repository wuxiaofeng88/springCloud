package com.km.springcloud.service;
/**
 * Created by asus-pc on 2019/7/7.
 */

import com.km.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DeptClientServiceFallbackFactory
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/7 15:48
 * @Version 1.0
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDeptno(id).setDname("该ID" + id + "在数据库中没有对应的记录, Consumer客户端提供的降级信息，此刻服务Provider不可用").setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
