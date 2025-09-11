package top.ldj.week1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lenovo
 * @Date: 2025/9/4
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @Value("${my.feature.helloSwitch}")
    private boolean isHelloEnabled;

    @Value("${my.feature.closeMsg}")
    private String closeMessage;
    @GetMapping("/hello")

        public String hello() {
        if (!isHelloEnabled) {
            return "接口开放中! 欢迎访问我的第一个 spring boot 项目";
        }else {
            return closeMessage;
        }

        }












   /* @GetMapping("/list")
    public List<String> getList() {
        return List.of("aaa", "bbb", "ccc");
    }


    @GetMapping("/strings")
    public List<String> strings(){
            return List.of("spring", "boot");
    }*/
}



