package top.ldj.springbootfilterinterceptor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.ldj.springbootfilterinterceptor.result.Result;

/**
 * @Author: lenovo
 * @Date: 2025/10/9
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test/filter")
    public Result<String> testFilter(@RequestParam String name) {
        return Result.ok("Hello, " + name);
    }

    @GetMapping("/pay/{id}")
    public Result<String> pay(@PathVariable long id) {
        log.info("开始支付");
        return Result.ok("支付成功，订单号：" + id);
    }
}
