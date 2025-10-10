package top.ldj.boot.filter_interceptor.result;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: lenovo
 * @Date: 2025/9/26
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
public class Result<T>{
    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static <T> Result<T> ok(T data) {
        return new Result<>(200, "success", data);
    }
    public static <T> Result<T> fail(String msg) {
        return new Result<>(500, msg, null);
    }
}
