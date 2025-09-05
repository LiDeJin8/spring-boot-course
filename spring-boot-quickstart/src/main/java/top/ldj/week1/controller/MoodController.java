package top.ldj.week1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lenovo
 * @Date: 2025/9/5
 * @Version: 1.0
 */
@RestController
public class MoodController {
        @Value("${my.mood.today}")
        private String today;

        @Value("${server.my.mood.content}")
        private String content;

        @Value("${server.my.mood.author}")
        private String author;
    }

