package com.service.Impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jhao
 * @Date 2019/4/21 15:58
 * @Description
 * @Modified by:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean login(User user) {
        /**
         * @Description
         * @author      jhao
         * @param       [user]
         * @return      boolean
         * @exception   
         * @date        2019/4/21 23:10
         */
        
        //Subject subject = SecurityUtils.getSubject();
        //UsernamePasswordToken token = new UsernamePasswordToken(user.getUsernamed(),user.getPassword());
        try {
            //subject.login(token);
            //如果账号密码正确，数据库就可以查找到相应的行并且返回
            User dbUser = userDao.getUserToken(user);
            if (dbUser!=null){
                return true;
            }

            return false;
        }catch (AuthenticationException e){
            return false;
        }


    }

    @Override
    public boolean signUp(User user) {
        int tmp = userDao.insertUser(user);
        return tmp==1?true:false;
    }
}
