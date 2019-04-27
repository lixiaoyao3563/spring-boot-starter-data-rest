package com.lxy.springbootstarterdatarest.controller;

import com.lxy.springbootstarterdatarest.dao.UserDao;
import com.lxy.springbootstarterdatarest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/set") //1
    public void set(){
        User user = new User("1","zhangan");
        userDao.save(user);
        userDao.stringRedisTemplateDemo();
    }

    @RequestMapping("/getStr") //2
    public String getStr(){
        return userDao.getString();
    }

    /*@RequestMapping("/getPerson") //3
    public User getPerson(){
        return userDao.getUser();
    }*/

}
