package com.demo.controller;

import com.demo.common.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dragonfly on 2017/8/11.
 */

@RestController
@RequestMapping(value = "property")
public class MyProperties {


    @Autowired
    private Environment env;

    @RequestMapping(value = "/mybatis")
    public String  getMybatis(){
        return  env.getProperty("mybatis.type-aliases-package");
    }

    @RequestMapping(value = "/all")
    public String  getAllEnv(){
      return  PropertyUtil.getAllProperties();
    }


}
