package com.fxw.fxwlongtermstudy.jedis;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @author tony fan
 */
public class JedisTX {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","fxw");
        String jsonString = jsonObject.toJSONString();
        // 乐观锁
        jedis.watch(jsonString);
        // 开启事务
        Transaction multi = jedis.multi();
        try {
            multi.set("user1",jsonString);
            multi.set("user2",jsonString);
            // 执行事务
            multi.exec();
            // 释放锁
            jedis.unwatch();
        } catch (Exception e) {
            // 放弃事务
            multi.discard();
        } finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();
        }
    }

}
