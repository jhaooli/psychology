package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author jhao
 * @Date 2019/4/21 11:25
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("/leave")
public class LeaveController {

    @RequestMapping(value = "/leave", method = RequestMethod.POST)
    public String newLeave(Model model) {
        /**
         * 方法实现说明
         * @author      jhao
         * @param       [model]
         * @return      java.lang.String
         * @exception   
         * @date        2019/4/21 11:25
         */
        return "/leaves/newLeave";
    }

    @RequestMapping(value = "/leave", method = RequestMethod.GET)
    public String getLeave(Model model) {

        return "getLeave";
    }

    @RequestMapping(value = "/updateleave", method = RequestMethod.POST)
    public String updateLeave(Model model) {

        return "updateLeave";
    }

    @RequestMapping(value = "/deleteleave", method = RequestMethod.POST)
    public String deleteLeave(Model model) {

        return "deleteLeave";
    }

}
