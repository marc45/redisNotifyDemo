package com.zz.redis.notification;

import com.zz.redis.RedisClient;

import redis.clients.jedis.Jedis;

public class TestJedis {

	public static void main(String[] args) {
        Jedis jedis = RedisClient.jedisPool.getResource();
        jedis.auth("123456");
        jedis.set("zz", "zzzzz");
        jedis.expire("zz", 5);
        
        jedis.del("zz");
        
        String name = jedis.get("zz");
        System.out.println(name);
        
        
	}

}
