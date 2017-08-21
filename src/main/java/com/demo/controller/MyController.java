package com.demo.controller;


import com.alibaba.fastjson.JSON;
import com.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.User;
/**
 * Created by dragonfly on 2017/8/10.
 */
@RequestMapping("user")
@RestController
public class MyController {

    @Autowired
    private UserMapper userDao;


    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public Object ok(){
         User entity =   userDao.selectByPrimaryKey(1);
         String userStr  = JSON.toJSONString(entity);
         System.out.println(userStr);
         return userStr;
    }







}
