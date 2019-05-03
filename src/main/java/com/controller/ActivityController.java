package com.controller;

import com.pojo.Activity;
import com.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/21 15:54
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;


    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:10
     */
    @RequestMapping(value = "insertActivity",method = RequestMethod.POST)
    public String insertActivity(Activity activity){

        activityService.insertActivity(activity);
        return null;
    }

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:20
     */
    @RequestMapping(value = "updateActivity",method = RequestMethod.POST)
    public String updateActivity(Activity activity){

        activityService.updateActivity(activity);
        return null;
    }

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:21
     */
    @RequestMapping(value = "deleteActivity",method = RequestMethod.POST)
    public String deleteActivity(Activity activity){

        activityService.deleteActivity(activity);
        return null;
    }

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:21
     */
    @RequestMapping(value = "listAllActivity",method = RequestMethod.GET)
    public String listAllActivity(){

        activityService.listAllActivity();
        return null;
    }

    @RequestMapping(value = "selectActivity",method = RequestMethod.GET)
    public String selectActivity(Activity activity){

        activityService.selectActivity(activity);
        return null;
    }
}
