package com.service;

import com.pojo.Member;
import com.pojo.Student;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/25 19:40
 * @Description
 * @Modified by:
 */
public interface AccountService {

    //获取所有学生账号的信息
    List<Student> listAllStudentAccount();

    //获取所有咨询师账号的信息
    List<Member> listAllMemberAccount();

    //修改密码
    int updateStudentPassword(Student student);

    int updateMemberPassword(Member member);
    //冻结账号
}
