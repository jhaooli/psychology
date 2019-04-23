package com.service.Impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jhao
 * @Date 2019/4/21 23:01
 * @Description
 * @Modified by:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getByName(String username) {
        /**
         * @Description
         * @author      jhao
         * @param       [username]
         * @return      com.pojo.User
         * @exception   
         * @date        2019/4/21 23:09
         */
        User user = userDao.getByName(username);
        return user;
    }
}
