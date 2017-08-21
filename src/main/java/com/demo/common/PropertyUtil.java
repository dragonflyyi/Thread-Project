package com.demo.common;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by dragonfly on 2017/8/11.
 */

@Component
public class PropertyUtil {

    private static Properties properties;


    public  PropertyUtil(){

        try {
            Resource resource = new ClassPathResource("/application.properties");//
            properties  = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){

        return properties == null ? null :  properties.getProperty(key);

    }




    public static String getAllProperties(){

        Enumeration<Object>   objs = properties.elements();
        while(objs.hasMoreElements()){
            String value = (String)objs.nextElement(); //调用nextElement方法获得元素

            System.out.println(value);
        }
         return "ok";

    }













}
