package com.controller;

import com.pojo.Member;
import com.pojo.Student;
import com.pojo.User;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Iterator;
import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/21 15:52
 * @Description 账号管理
 * @Modified by:
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("listAllStudentAccount")
    public String listAllStudentAccount(){
        /**
         * @Description //获取所有学生账号的信息
         * @author      jhao
         * @param       []
         * @return      java.lang.String
         * @exception
         * @date        2019/4/25 22:40
         */
        try{
            List<Student> userList = accountService.listAllStudentAccount();
            sysoutResult(userList);
            return "/account/listAllStudentAccount";
        }catch (Exception e){
            System.out.println("class"+getClass().getName()+" error");
            return "/errors/error";
        }

    }

    @RequestMapping("listAllMemberAccount")
    public String listAllMemberAccount(){
        /**
         * @Description 获取所有咨询师账号的信息
         * @author      jhao
         * @param       []
         * @return      java.lang.String
         * @exception
         * @date        2019/4/25 22:42
         */
        try {
            List<Member> memberList = accountService.listAllMemberAccount();
            sysoutResult(memberList);
            return "/account/listAllMemberAccount";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("类class"+getClass().getName()+" error");
            return "/errors/error";
        }
    }


    @RequestMapping(value = "updateStudentPassword",method = RequestMethod.POST)
    public String updateStudentPassword(Student student){
        /**
         * @Description //修改密码
         * @author      jhao
         * @param       [student]
         * @return      java.lang.String
         * @exception
         * @date        2019/4/25 22:42
         */
        try {
            accountService.updateStudentPassword(student);
            return "/account/updateStudentPassword";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("类class"+getClass().getName()+" error");
            return "/errors/error";
        }
    }

    @RequestMapping(value = "updateMemberPassword",method = RequestMethod.POST)
    public String  updateMemberPassword(Member member){
        /**
         * @Description //修改密码
         * @author      jhao
         * @param       [member]
         * @return      java.lang.String
         * @exception
         * @date        2019/4/25 22:42
         */
        try {
            accountService.updateMemberPassword(member);
            return "/account/updateMemberPassword";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("类class"+getClass().getName()+" error");
            return "/errors/error";
        }
    }

    public void sysoutResult(List list ){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("结果 + "+iterator.next().toString());
        }
    }
}
