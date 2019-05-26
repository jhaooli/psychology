package com.controller;

import com.pojo.Feedback;
import com.pojo.Reservation;
import com.service.FeedbackService;
import com.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/21 15:50
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("feedback")
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @Autowired
    ReservationService reservationService;

    /**
     * @Description 新增反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:01
     */
    @RequestMapping(value = "insertFeedback",method = RequestMethod.POST)
    public String insertFeedback(Feedback feedback){
        feedbackService.insertFeedback(feedback);
        return "/feedback/insertFeedback";
    }

    /**
     * @Description 删除反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:04
     */
    @RequestMapping(value = "deleteFeedback",method = RequestMethod.POST)
    public String deleteFeedback(Feedback feedback){
        feedbackService.deleteFeedback(feedback);
        return "/feedback/deleteFeedback";
    }

    /**
     * @Description 修改反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:04
     */
    @RequestMapping(value = "updateFeedback",method = RequestMethod.POST)
    public String updateFeedback(Feedback feedback){
        feedbackService.updateFeedback(feedback);
        return "/feedback/updateFeedback";
    }

    /**
     * @Description 获取所有的反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:05
     */
    @RequestMapping("listAllFeedback")
    public String listAllFeedback(){
        feedbackService.listAllFeedback();
        return null;
    }

    /**
     * @Description 获取某个咨询师所有的反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:05
     */
    @RequestMapping("listAllFeedbackForOneMember")
    public String listAllFeedbackForOneMember(Feedback feedback){
        feedbackService.listAllFeedbackForOneMember(feedback);
        return null;
    }

    /**
     * @Description 获取某个用户所有的心理反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:07
     */
    @RequestMapping("listAllFeedbackForOneStudent")
    public String listAllFeedbackForOneStudent(Feedback feedback,Model model, HttpSession httpSession){

        Integer id = (Integer) httpSession.getAttribute("studentId");
        String studentName = (String) httpSession.getAttribute("studentName");
        if(studentName == null && id == null){
            System.out.println("仍未登录/非法访问");
            return "error";
        }
        feedback.setStudentId(id);
        List<Feedback> feedbackList = feedbackService.listAllFeedbackForOneStudent(feedback);
        model.addAttribute("detailList",feedbackList);
        return "/feedback/feedbacks";
    }

    /**
     * @Description 找单独一条反馈 通过预约id
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:08
     */
    @RequestMapping("selectOneFeedbackByReservationId")
    public String selectOneFeedbackByReservationId(Feedback feedback){
        feedbackService.selectOneFeedbackByReservationId(feedback);
        return null;
    }

    @RequestMapping("creation")
    public String creation(Feedback feedback,Model model, HttpSession httpSession){

        Integer id = (Integer) httpSession.getAttribute("memberId");
        String memberName = (String) httpSession.getAttribute("memberName");
        if(memberName == null && id == null){
            System.out.println("仍未登录/非法访问");
            return "error";
        }
        Reservation reservation = new Reservation();
        reservation.setMemberId(id);
        List<Reservation> reservationList = reservationService.listAllReservationByMemberId(reservation);
        for (Reservation reservation1 : reservationList) {
            System.out.println(reservation1.toString());
        }
        model.addAttribute("detailList",reservationList);
        return "/feedback/feedback-create";
    }

}
