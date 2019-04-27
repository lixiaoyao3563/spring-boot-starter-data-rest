package com.lxy.springbootstarterdatarest.dao;

import com.lxy.springbootstarterdatarest.domain.Person;
import com.lxy.springbootstarterdatarest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDao {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> valOpsStr;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name="redisTemplate")
    ValueOperations<Object, Object> valOps;


    public void stringRedisTemplateDemo(){
        valOpsStr.set("xx", "yy");
    }

    public void save(User user){
        valOps.set(user.getId(),user);
    }

    public String getString(){
        return valOpsStr.get("xx");
    }

  /*  public Person getUser(){
        return (User) valOps.get("1");
    }*/



}
