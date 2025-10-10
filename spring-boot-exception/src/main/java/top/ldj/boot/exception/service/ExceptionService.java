package top.ldj.boot.exception.service;

import org.springframework.stereotype.Service;
import top.ldj.boot.exception.enums.ErrorCode;
import top.ldj.boot.exception.exception.ServerException;

/**
 * @Author: lenovo
 * @Date: 2025/9/19
 * @Version: 1.0
 */
@Service
public class ExceptionService {
    public void unAuthorizedError(){
        // 未登录
        throw new ServerException(ErrorCode.UNAUTHORIZED);
    }
    public void systemError(){
        // 系统异常
        throw new ServerException("系统异常");
    }

}
