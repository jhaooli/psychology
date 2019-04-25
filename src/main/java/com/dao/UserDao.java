package com.dao;

import com.pojo.User;

/**
 * @Author jhao
 * @Date 2019/4/21 22:54
 * @Description
 * @Modified by:
 */
public interface UserDao {


    /**
     * @Description
     * @author      jhao
     * @param
     * @return      
     * @exception   
     * @date        2019/4/21 23:08
     */
    User getByName(String username);

    User getUserToken(User user);

}
