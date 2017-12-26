package com.zz.redis.notification;

import com.zz.redis.RedisClient;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class KeyExpiredListener extends JedisPubSub {

	@Override
	public int getSubscribedChannels() {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		return super.getSubscribedChannels();
	}

	@Override
	public boolean isSubscribed() {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		return super.isSubscribed();
	}

	@Override
	public void onMessage(String channel, String message) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.onMessage(channel, message);
	}

	@Override
	public void onPMessage(String pattern, String channel, String message) {
		// TODO Auto-generated method stub
		System.out.println("~~~" + pattern);
		System.out.println("~~~" + channel);
		System.out.println("~~~" + message);
		
		Jedis jedis = RedisClient.jedisPool.getResource();
		jedis.auth("123456");
		System.out.println(jedis.get(message));
		
		super.onPMessage(pattern, channel, message);
	}

	@Override
	public void onPSubscribe(String pattern, int subscribedChannels) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.onPSubscribe(pattern, subscribedChannels);
	}

	@Override
	public void onPUnsubscribe(String pattern, int subscribedChannels) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.onPUnsubscribe(pattern, subscribedChannels);
	}

	@Override
	public void onSubscribe(String channel, int subscribedChannels) {
		// TODO Auto-generated method stub
		super.onSubscribe(channel, subscribedChannels);
	}

	@Override
	public void onUnsubscribe(String channel, int subscribedChannels) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.onUnsubscribe(channel, subscribedChannels);
	}

	@Override
	public void proceed(Client client, String... channels) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.proceed(client, channels);
	}

	@Override
	public void proceedWithPatterns(Client client, String... patterns) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.proceedWithPatterns(client, patterns);
	}

	@Override
	public void psubscribe(String... patterns) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.psubscribe(patterns);
	}

	@Override
	public void punsubscribe() {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.punsubscribe();
	}

	@Override
	public void punsubscribe(String... patterns) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.punsubscribe(patterns);
	}

	@Override
	public void subscribe(String... channels) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.subscribe(channels);
	}

	@Override
	public void unsubscribe() {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.unsubscribe();
	}

	@Override
	public void unsubscribe(String... channels) {
		// TODO Auto-generated method stub
		System.out.println("111111111111111");
		super.unsubscribe(channels);
	}
	
}
