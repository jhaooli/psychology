package com.controller;

import com.pojo.Reservation;
import com.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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



    @RequestMapping("/getReservation")
    @ResponseBody
    public List<Reservation> getReservation(Reservation reservation,Model model){

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

        return reservationList;
        //return "/reservation/getReservation";
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
    @ResponseBody
    public List<Reservation> listAllReservationByMemberId(Reservation reservation){
        /**
         * @Description  //通过咨询师id获取ta的所以预约
         * @author      jhao
         * @param       [reservation]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/23 15:21
         */
        try{
            List<Reservation> reservationList = reservationService.listAllReservationByMemberId(reservation);
            return reservationList;
            //return "/reservation/getReservation";
        }catch (Exception e){
            e.printStackTrace();
            //return "/errors/error";
            return null;
        }
    }


    @RequestMapping("listAllReservationByStudentId")
    @ResponseBody
    public List<Reservation> listAllReservationByStudentId(Reservation reservation){
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
            return reservationList;
            //return "/reservation/getReservation";
        }catch (Exception e){
            e.printStackTrace();
            //return "/errors/error";
            return null;
        }
    }

}
