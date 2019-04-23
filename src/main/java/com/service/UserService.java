package com.service;

import com.pojo.User;

/**
 * @Author jhao
 * @Date 2019/4/21 23:01
 * @Description
 * @Modified by:
 */
public interface UserService {

    User getByName(String username);
}
