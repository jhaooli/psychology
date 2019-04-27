package com.dao;

import com.pojo.Member;
import com.pojo.Student;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/25 19:53
 * @Description
 * @Modified by:
 */
public interface AccountDao {

    //获取所有学生账号的信息
    List<Student> listAllStudentAccount();

    //获取所有咨询师账号的信息
    List<Member> listAllMemberAccount();

    //修改密码
    int updateStudentPassword(Student student);

    int updateMemberPassword(Member member);
}
