package com.controller;

import com.pojo.Member;
import com.pojo.Student;
import com.pojo.User;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
* @Description:
* @Author:         jhao
* @CreateDate:     2019/4/21 11:15
* @UpdateUser:     jhao
* @UpdateDate:     2019/4/21 11:15
* @UpdateRemark:
* @Version:        1.0
*/
@Controller
@RequestMapping("/new")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, HttpSession httpSession) {
        /**
         * @Description
         * @author      jhao
         * @param       [user]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/25 22:57
         */
        System.out.println("登录验证中 " + user.toString());
        if(loginService.login(user)){
            //登录成功
            httpSession.setAttribute("studentName",user.getUsernamed());
            httpSession.setAttribute("studentId",loginService.getUserId(user).getId());
            System.out.println("登录成功 "+ user.toString());
            return "/account/logined";
        }else {

            return "error";
        }


    }


    @RequestMapping(value = "signUp",method = RequestMethod.POST)
    public String signUp(User user){

        /**
         * @Description
         * @author      jhao
         * @param       [user]
         * @return      java.lang.String
         * @exception   
         * @date        2019/5/4 21:55
         */
        loginService.signUp(user);
        return null;
    }

    @RequestMapping(value = "/advisoryLogin", method = RequestMethod.POST)
    public String advisoryLogin(Member member, HttpSession httpSession) {
        /**
         * @Description
         * @author      jhao
         * @param       [user]
         * @return      java.lang.String
         * @exception
         * @date        2019/4/25 22:57
         */
        System.out.println("登录验证中 " + member.toString());
        if(loginService.getMemberToken(member)){
            //登录成功
            httpSession.setAttribute("memberName",member.getUsernamed());
            httpSession.setAttribute("memberId",loginService.getMemberId(member).getId());
            System.out.println("登录成功 "+ member.toString());
            return "redirect:/reservation-accept";
        }else {

            return "error";
        }


    }

}
