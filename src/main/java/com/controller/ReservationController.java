package com.controller;

import com.pojo.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author jhao
 * @Date 2019/4/21 15:47
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("reservation")
public class ReservationController {

    @RequestMapping("/getReservation")
    public String getReservation(Reservation reservation){

    /**
     * @Description
     * @author      jhao
     * @param       [reservation]
     * @return      java.lang.String
     * @exception
     * @date        2019/4/23 11:17
     */

        return "/reservation/getReservation";
    }
}
