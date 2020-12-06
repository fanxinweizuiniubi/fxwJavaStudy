package com.fxw.fxwlongtermstudy.redis;

import com.fxw.fxwlongtermstudy.FxwLongTermStudyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FxwLongTermStudyApplication.class)
public class TestRedisTemplate {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void test(){
        // operate String
        redisTemplate.opsForValue().set("name","fxw");
        // operate hash
        //redisTemplate.opsForHash().put("student","name","fxw");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

}
