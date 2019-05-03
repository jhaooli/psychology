package com.dao;

import com.pojo.Activity;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/29 21:36
 * @Description
 * @Modified by:
 */
public interface ActivityDao {

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:10
     */
    int insertActivity(Activity activity);

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:20
     */
    int updateActivity(Activity activity);

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:21
     */
    int deleteActivity(Activity activity);

    /**
     * @Description
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/5/3 22:21
     */
    List<Activity> listAllActivity();

    Activity selectActivity(Activity activity);
}
