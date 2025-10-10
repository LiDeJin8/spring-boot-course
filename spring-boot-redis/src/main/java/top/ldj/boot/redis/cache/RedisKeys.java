package top.ldj.boot.redis.cache;

/**
 * @Author: lenovo
 * @Date: 2025/9/25
 * @Version: 1.0
 */
public class RedisKeys {
    public static String getSmsKey(String phone) {
        return"sms:captcha:"+phone;
    }
}
