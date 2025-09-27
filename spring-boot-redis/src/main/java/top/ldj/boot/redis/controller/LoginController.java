package top.ldj.boot.redis.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ldj.boot.redis.dto.LoginRequest;
import top.ldj.boot.redis.result.Result;
import top.ldj.boot.redis.service.LoginService;
import top.ldj.boot.redis.vo.LoginResponse;

/**
 * @Author: lenovo
 * @Date: 2025/9/25
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    public Result<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = loginService.login(loginRequest);
        return Result.ok(loginResponse);
    }
}