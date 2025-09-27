package top.ldj.boot.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.ldj.boot.mp.entity.UserAccount;
import top.ldj.boot.mp.mapper.UserAccountMapper;
import top.ldj.boot.mp.service.UserAccountService;

import java.util.List;

/**
 * @Author: lenovo
 * @Date: 2025/9/18
 * @Version: 1.0
 */
@Service
@Transactional
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {
    private  static final BCryptPasswordEncoder ENCODER = new BCryptPasswordEncoder();

    @Override
    public boolean createUser(UserAccount user){
        processUserBeforeSave(user);
        return this.save(user);
    }

    @Override
    public boolean createUsers(List<UserAccount> users){
        users.forEach(this::processUserBeforeSave);
        return this.saveBatch(users,1000);
    }
    private void processUserBeforeSave(UserAccount user) {
        //仅当传入的是明文时，加密后在保存
        if(user.getPassword()!=null && !user.getPassword().startsWith("$2")){
            user.setPassword(ENCODER.encode(user.getPassword()));
        }
        if (user.getStatus()== null){
            user.setStatus(1);
        }
        if (user.getDeleted() == null){
            user.setDeleted(0);
        }
        if(user.getVersion() == null){
            user.setVersion(0);
        }

    }
}
