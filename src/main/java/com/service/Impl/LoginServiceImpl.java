package com.service.Impl;

import com.pojo.User;
import com.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * @Author jhao
 * @Date 2019/4/21 15:58
 * @Description
 * @Modified by:
 */
@Service
public class LoginServiceImpl implements LoginService {


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
        
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsernamed(),user.getPassword());
        try {
            subject.login(token);
        }catch (AuthenticationException e){
            return false;
        }

        return true;
    }
}
