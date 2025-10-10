package top.ldj.boot.filter_interceptor.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @Author: lenovo
 * @Date: 2025/9/26
 * @Version: 1.0
 */
@Slf4j
@Component
public class MyInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("MyInterceptor preHandle:{}", requestURI);
        LocalDateTime beginTime = LocalDateTime.now();
        request.setAttribute("beginTime", beginTime);

        return true;

    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LocalDateTime beginTime = (LocalDateTime) request.getAttribute("beginTime");
        LocalDateTime endTime = LocalDateTime.now();

        Duration duration = Duration.between(beginTime, endTime);
        long milliseconds = duration.toMillis();
        String requestURI = request.getRequestURI();
        log.info("MyInterceptor 执行结束:{} 耗时:{}ms", request.getRequestURI(), milliseconds);
    }
}
