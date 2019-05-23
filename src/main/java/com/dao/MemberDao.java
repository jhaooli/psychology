package com.dao;

import com.pojo.Member;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/5/20 8:42
 * @Description
 * @Modified by:
 */
public interface MemberDao {
    List<Member> listAllMembers();
}
