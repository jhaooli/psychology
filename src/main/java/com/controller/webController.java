package com.controller;

import com.pojo.Member;
import com.pojo.Reservation;
import com.service.MemberService;
import com.service.ReservationService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author jhao
 * @Date 2019/5/4 22:14
 * @Description
 * @Modified by:
 */
@Controller
public class webController {
    /*
    这是一个页面跳转中转站
     */
    @Autowired
    MemberService memberService;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("index")
    public String index(){
        return "/account/index";
    }


    @RequestMapping("reservation")
    public String reservationCreation(Model model, HttpSession httpServletSession) {
        /**
         * @Description 跳转到预约登录页面
         * @author      jhao
         * @param       []
         * @return      java.lang.String
         * @exception
         * @date        2019/5/20 8:36
         */
        Integer id = (Integer) httpServletSession.getAttribute("studentId");
        String studentName = (String) httpServletSession.getAttribute("studentName");
        if(studentName == null && id == null){
            System.out.println("仍未登录/非法访问");
            return "error";
        }
        System.out.println("登陆成功 student name = " + studentName + "id = " + id );
        List<Member> memberList = memberService.listAllMembers();
        model.addAttribute("detailList",memberList);
        return "/reservation/reservation-create";
    }

    //跳转到删除页面
    @RequestMapping("reservation-delete")
    public String reservationDeletion(Model model, Reservation reservation,HttpSession httpSession){
        int id = (int)httpSession.getAttribute("studentId");
        reservation.setStudentId(id);
        List<Reservation> reservationList = reservationService.listAllReservationByStudentId(reservation);
        model.addAttribute("detailList",reservationList);
        return "/reservation/reservation-delete";
    }



    /**
     * @Description  跳转到咨询接受页面
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/24 14:43
     */
    @RequestMapping("reservation-accept")
    public String reservationAccept(Model model,HttpSession httpSession){
        System.out.println("跳转到接受页面");
        int memberId = (int)httpSession.getAttribute("memberId");
        if(memberId==0){
            return "/error";
        }
        Reservation reservation = new Reservation();
        reservation.setMemberId(memberId);
        List<Reservation> reservationList = reservationService.listAllReservationByMemberId(reservation);
        model.addAttribute("detailList",reservationList);
        return "/reservation/reservation-accept";
    }

    @RequestMapping("activity-create")
    public String activity(){
        System.out.println("跳转到活动页面");
        return "/activity/activity-create";
    }

    @RequestMapping("advisoryLogin")
    public String advisoryLogin(){
        System.out.println("跳转到登录界面页面");
        return "/account/advisory-login";
    }

}
