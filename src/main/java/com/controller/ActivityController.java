package com.controller;

import com.pojo.Activity;
import com.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String insertActivity(Activity activity,Model model){

        activityService.insertActivity(activity);
        List<Activity> activityList = activityService.listAllActivity();
        for (Activity a : activityList) {
            a.setId(a.getId()%8);
        }

        model.addAttribute("detailList",activityList);
        return "/activity/admin-activity";
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
    @RequestMapping(value = "deleteActivity",method = RequestMethod.GET)
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


    /**
     * @Description 跳转到新建活动页面
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/21 10:53
     */
    /*
    @RequestMapping(value = "creation",method = RequestMethod.GET)
    public String creation(Activity activity){


        return "/activity/activity-create";
    }
    */

    /**
     * @Description 跳转到删除活动页面
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/21 10:53
     */
    @RequestMapping(value = "deletion",method = RequestMethod.GET)
    public String deletion(Activity activity){

        return "/activity/activity-deletion";
    }

    /**
     * @Description 跳转到更新活动页面
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/21 10:53
     */
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public String update(Activity activity){

        return "/activity/activity-update";
    }


    /**
     * @Description 跳转到更新活动页面
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/21 10:53
     */
    @RequestMapping(value = "selection",method = RequestMethod.GET)
    public String selection(Activity activity,Model model){

        List<Activity> activityList = activityService.listAllActivity();
        for (Activity a : activityList) {
            a.setId(a.getId()%8);
        }

        model.addAttribute("detailList",activityList);
        return "/activity/activity";
    }

    /**
     * @Description 管理员跳转到活动管理界面
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/22 13:37
     */
    @RequestMapping(value = "admin-selection",method = RequestMethod.GET)
    public String selectionByAdmin(Activity activity,Model model){

        List<Activity> activityList = activityService.listAllActivity();
        for (Activity a : activityList) {
            a.setId(a.getId()%8);
        }

        model.addAttribute("detailList",activityList);
        return "/activity/admin-activity";
    }
}
