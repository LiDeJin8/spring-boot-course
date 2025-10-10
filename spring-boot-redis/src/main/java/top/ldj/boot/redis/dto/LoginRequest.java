package top.ldj.boot.redis.dto;

import lombok.Data;

/**
 * @Author: lenovo
 * @Date: 2025/9/25
 * @Version: 1.0
 */
@Data
public class LoginRequest {
    private String phone;
    private String code;
}
