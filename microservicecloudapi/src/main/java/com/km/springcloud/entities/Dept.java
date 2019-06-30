package com.km.springcloud.entities;
/**
 * Created by asus-pc on 2019/6/28.
 */

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/28 18:08
 * @Version 1.0
 **/
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
