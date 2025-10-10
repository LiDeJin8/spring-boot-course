package top.ldj.boot.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.ldj.boot.mp.entity.UserAccount;

import java.util.List;

/**
 * @Author: lenovo
 * @Date: 2025/9/18
 * @Version: 1.0
 */
public interface UserAccountService extends IService<UserAccount> {
    /*
    *创建用户对密码进行BCrypt加密
    * */
    boolean createUser(UserAccount user);



    boolean createUsers(List<UserAccount> users);
}
