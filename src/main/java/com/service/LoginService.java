package com.service;

import com.pojo.Member;
import com.pojo.User;

/**
 * @Author jhao
 * @Date 2019/4/21 15:57
 * @Description
 * @Modified by:
 */
public interface LoginService {

    boolean login(User user);

    boolean signUp(User user);

    User getUserId(User user);

    /**
     * @Description 咨询师的id以及登录验证
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/23 20:30
     */
    Member getMemberId(Member member);

    boolean getMemberToken(Member member);
}
