package com.dxtd.demo;
import redis.clients.jedis.Jedis;
public class RedisDemo {

    public static void main(String[] args) {
    Jedis jd = new Jedis("127.0.0.1", 6379);
    jd.set("name", "zhangsan");
    String name = jd.get("name");
    System.out.println(name);
    jd.close();
    }
}
