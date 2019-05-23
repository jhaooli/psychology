package com.service;

import com.pojo.Member;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/5/20 8:37
 * @Description  心理咨询师数据服务类
 * @Modified by:
 */
public interface MemberService {

    List<Member> listAllMembers();
}
