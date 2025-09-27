package top.ldj.boot.redis.service;

import top.ldj.boot.redis.dto.LoginRequest;
import top.ldj.boot.redis.vo.LoginResponse;

/**
 * @Author: lenovo
 * @Date: 2025/9/25
 * @Version: 1.0
 */
public interface LoginService {
    /**
     * 验证码登录*
     * @@param loginRequest 登录请求参数
     * @return 登录响应
     */
    LoginResponse login(LoginRequest loginRequest);
}
