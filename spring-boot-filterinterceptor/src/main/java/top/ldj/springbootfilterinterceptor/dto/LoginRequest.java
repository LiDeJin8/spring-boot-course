package top.ldj.springbootfilterinterceptor.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Author: lenovo
 * @Date: 2025/10/9
 * @Version: 1.0
 */
@Data
public class LoginRequest {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;







}
