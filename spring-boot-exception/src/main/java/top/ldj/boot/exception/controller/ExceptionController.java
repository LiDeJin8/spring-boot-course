package top.ldj.boot.exception.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import top.ldj.boot.exception.entity.User;
import top.ldj.boot.exception.result.Result;
import top.ldj.boot.exception.service.ExceptionService;

/**
 * @Author: lenovo
 * @Date: 2025/9/19
 * @Version: 1.0
 */
@AllArgsConstructor
@RestController
public class ExceptionController {
    @Resource
    private ExceptionService exceptionService;

    @GetMapping("/test/{id}")
    public Result<String> getInfo(@PathVariable int id) {
        if (id == 1) {
            exceptionService.unAuthorizedError();
        } else if (id == 2) {
            exceptionService.systemError();
        }
        return Result.ok("请求成功");
    }
    @PostMapping("/user")
    public Result<User> createUser(@Valid @RequestBody User  user) {
        return Result.ok(user);
    }
}