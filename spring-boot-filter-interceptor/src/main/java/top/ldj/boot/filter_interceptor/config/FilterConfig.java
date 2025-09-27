package top.ldj.boot.filter_interceptor.config;

import lombok.AllArgsConstructor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.ldj.boot.filter_interceptor.filter.MyFilter;
import top.ldj.boot.filter_interceptor.filter.RateLimitFilter;
import top.ldj.boot.filter_interceptor.filter.YourFilter;

/**
 * @Author: lenovo
 * @Date: 2025/9/26
 * @Version: 1.0
 */
@Configuration
@AllArgsConstructor
public class FilterConfig {
    private final MyFilter myFilter;
    private final YourFilter yourFilter;
    private final RateLimitFilter rateLimitFilter;


   /* @Bean
    public FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean() {
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(myFilter);
        registrationBean.addUrlPatterns("/api/test");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<YourFilter> yourFilterFilterRegistrationBean() {
        FilterRegistrationBean<YourFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(yourFilter);
        registrationBean.addUrlPatterns("/api/test");
        return registrationBean;
    }*/

    @Bean
    public FilterRegistrationBean<RateLimitFilter> rateLimitFilterFilterRegistrationBean() {
        FilterRegistrationBean<RateLimitFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(rateLimitFilter);
        registrationBean.addUrlPatterns("/api/pay/*");
        registrationBean.setOrder(3);
        return registrationBean;
    }
}