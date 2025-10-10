package top.ldj.boot.redis.service;

/**
 * @Author: lenovo
 * @Date: 2025/9/25
 * @Version: 1.0
 */
public interface SmsService {
    /*
    * 发送短信
    *
    * @param phone 手机号
    * */
    boolean sendSms(String phone);
}
