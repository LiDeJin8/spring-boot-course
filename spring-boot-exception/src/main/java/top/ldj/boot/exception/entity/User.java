package top.ldj.boot.exception.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import top.ldj.boot.exception.annotation.Phone;

/**
 * @Author: lenovo
 * @Date: 2025/9/19
 * @Version: 1.0
 */
@Data
public class User {
    @NotBlank(message="用户名不能为空")
    private String username;

    @NotBlank(message="密码不能为空")
    private String password;
    @Max(value=100,message="年龄不能超过100岁")
    @Min(value=1,message="年龄不能小于1岁")
    private int age;
    @NotBlank(message="手机号不能为空")

    @NotBlank(message = "手机号不能为空")
    @Phone
    private String phone;
}
