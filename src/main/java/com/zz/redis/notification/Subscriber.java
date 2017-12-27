package com.zz.redis.notification;

import com.zz.redis.RedisClient;

import redis.clients.jedis.Jedis;

public class Subscriber {

	public static void main(String[] args) {
		Jedis jedis = RedisClient.jedisPool.getResource();
		jedis.auth("123456");
        jedis.psubscribe(new KeyExpiredListener(), "__key*__:*");
       // jedis.psubscribe(new KeyExpiredListener(), "__keyevent@0__:expired");
        
	}

}
