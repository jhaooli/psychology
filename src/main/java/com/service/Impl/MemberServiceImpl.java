package com.service.Impl;

import com.dao.MemberDao;
import com.pojo.Member;
import com.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/5/20 8:39
 * @Description
 * @Modified by:
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    @Override
    public List<Member> listAllMembers() {
        /**
         * @Description
         * @author      jhao
         * @param       []
         * @return      java.util.List<com.pojo.Member>
         * @exception   
         * @date        2019/5/20 8:54
         */
        return memberDao.listAllMembers();
    }
}
