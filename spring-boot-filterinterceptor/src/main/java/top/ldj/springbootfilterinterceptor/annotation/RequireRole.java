package top.ldj.springbootfilterinterceptor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @Author: lenovo
 * @Date: 2025/10/9
 * @Version: 1.0
 */
/**
 * 自定义权限注解
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequireRole {
    // 角色名称数组，支持多个
    String[] value();
}
