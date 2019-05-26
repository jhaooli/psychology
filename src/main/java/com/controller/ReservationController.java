package com.controller;

import com.pojo.Reservation;
import com.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/21 15:47
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;


    /**
     * @Description 咨询师接受用户预约
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/24 14:32
     */
    @RequestMapping("/acception")
    public String acception(Reservation reservation,Model model,HttpSession httpSession){

        int tmp = reservationService.acception(reservation);

        int memberId = (int)httpSession.getAttribute("memberId");
        if(memberId==0){
            return "/error";
        }
        //Reservation reservation1 = new Reservation();
        reservation.setMemberId(memberId);
        List<Reservation> reservationList = reservationService.listAllReservationByMemberId(reservation);
        model.addAttribute("detailList",reservationList);
        return tmp==1? "/reservation/reservation-accept" : "error";
    }

    /**
     * @Description  完成当前预约
     * @author      jhao
     * @param
     * @return      java.lang.String
     * @exception
     * @date        2019/4/23 11:17
     */
    @RequestMapping("/finish")
    public String finish(Reservation reservation,Model model){

        int tmp = reservationService.updateReservation(reservation);
        return tmp==1? "/reservation/reservation-accept" : "error";
    }


    @RequestMapping("/getReservation")
    public String getReservation(Reservation reservation,Model model){

    /**
     * @Description  获取所有的预约
     * @author      jhao
     * @param       [reservation]
     * @return      java.lang.String
     * @exception
     * @date        2019/4/23 11:17
     */
        List<Reservation> reservationList = reservationService.listAllReservation();
        model.addAttribute("reservationList",reservationList);

        //return reservationList;
        return "/reservation/getReservation";
    }

    @RequestMapping(value = "/createReservation",method = RequestMethod.POST)
    public String createReservation(Reservation reservation){
        /**
         * @Description 新增预约
         * @author      jhao
         * @param       [reservation]
         * @return      java.lang.String
         * @exception
         * @date        2019/4/23 15:08
         */
        try{
            System.out.println(reservation.toString());
            reservationService.createReservation(reservation);
            return "/reservation/createReservation";
        }catch (Exception e){
            e.printStackTrace();
            return "/errors/error";
        }
    }


    @RequestMapping(value = "deleteReservation",method = RequestMethod.GET)
    public String deleteReservation(Reservation reservation){
        /**
         * @Description      //删除预约 通过id作为扫描依据删除预约
         * @author      jhao
         * @param       [reservation]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/23 15:17
         */
        try{
            System.out.println(reservation.toString());
            reservationService.deleteReservation(reservation);
            return "/reservation/deleteReservation";
        }catch (Exception e){
            e.printStackTrace();
            return "/errors/error";
        }
    }


    @RequestMapping(value = "updateReservation",method = RequestMethod.POST)
    public String  updateReservation(Reservation reservation){
        /**
         * @Description 修改预约 通过id作为扫描依据修改预约
         * @author      jhao
         * @param       [reservation]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/23 15:17
         */
        try{
            System.out.println(reservation.toString());
            reservationService.updateReservation(reservation);
            return "/reservation/updateReservation";
        }catch (Exception e){
            e.printStackTrace();
            return "/errors/error";
        }
    }


    @RequestMapping("listAllReservationByMemberId")
    public String listAllReservationByMemberId(Reservation reservation,Model model,HttpSession httpSession){
        /**
         * @Description  //通过咨询师id获取ta的所以预约
         * @author      jhao
         * @param       [reservation]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/23 15:21
         */
        try{
            int memberId = (int)httpSession.getAttribute("memberId");
            if(memberId ==0){
                return "/error";
            }
            reservation.setMemberId(memberId);
            List<Reservation> reservationList = reservationService.listAllReservationByMemberId(reservation);
            //return reservationList;
            model.addAttribute("detailList",reservationList);
            return "/reservation/reservation-accept";
        }catch (Exception e){
            e.printStackTrace();
            return "/errors/error";
            //return null;
        }
    }


    @RequestMapping("listAllReservationByStudentId")
    public String listAllReservationByStudentId(Reservation reservation){
        /**
         * @Description //通过学生id获取ta的所有预约
         * @author      jhao
         * @param       [reservation]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/23 15:21
         */
        try{
            List<Reservation> reservationList = reservationService.listAllReservationByStudentId(reservation);
            //return reservationList;
            return "/reservation/getReservation";
        }catch (Exception e){
            e.printStackTrace();
            return "/errors/error";
            //return null;
        }
    }

    @RequestMapping("selections")
    public String reservationSelection(Model model, Reservation reservation,HttpSession httpServletSession){
        System.out.println("跳转到selection页面");
        //Integer id = (Integer) httpServletSession.getAttribute("studentId");
        int id = (int)httpServletSession.getAttribute("studentId");
        String studentName = (String) httpServletSession.getAttribute("studentName");
        System.out.println("session中获取的id =  " + id + " studentName = "+ studentName );
        if(studentName == null && id == 0){
            System.out.println("仍未登录/非法访问");
            return "error";
        }
        reservation.setStudentId(id);
        List<Reservation> reservationList = reservationService.listAllReservationByStudentId(reservation);
        model.addAttribute("detailList",reservationList);
        return "/reservation/reservation-selections";
    }

    @RequestMapping("update")
    public String reservationUpdate(Model model, Reservation reservation,HttpSession httpServletSession){
        System.out.println("跳转到update页面");
        Integer id = (Integer) httpServletSession.getAttribute("studentId");
        String studentName = (String) httpServletSession.getAttribute("studentName");
        if(studentName == null && id == null){
            System.out.println("仍未登录/非法访问");
            return "error";
        }
        reservation.setStudentId(id);
        List<Reservation> reservationList = reservationService.listAllReservationByStudentId(reservation);
        model.addAttribute("detailList",reservationList);
        return "/reservation/reservation-update";
    }

    @RequestMapping("reservations")
    public String reservations(){
        System.out.println("跳转到reservation页面");
        return "/reservation/reservations";
    }

    @RequestMapping("selections-admin")
    public String reservationSelectionAdmin(Model model, Reservation reservation,HttpSession httpServletSession){
        System.out.println("跳转到Guanliyuan页面");
        /*
        Integer id = (Integer) httpServletSession.getAttribute("studentId");
        String studentName = (String) httpServletSession.getAttribute("studentName");
        if(studentName == null && id == null){
            System.out.println("仍未登录/非法访问");
            return "error";
        }
        reservation.setId(id);
        */
        List<Reservation> reservationList = reservationService.listAllReservation();
        model.addAttribute("detailList",reservationList);
        return "/admin/reservation-selections";
    }
}
