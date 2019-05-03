package com.service.Impl;

import com.dao.ActivityDao;
import com.pojo.Activity;
import com.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/29 21:37
 * @Description
 * @Modified by:
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityDao activityDao;
    @Override
    public int insertActivity(Activity activity) {
        return activityDao.insertActivity(activity);
    }

    @Override
    public int updateActivity(Activity activity) {
        return activityDao.updateActivity(activity);
    }

    @Override
    public int deleteActivity(Activity activity) {
        return activityDao.deleteActivity(activity);
    }

    @Override
    public List<Activity> listAllActivity() {
        return activityDao.listAllActivity();
    }

    @Override
    public Activity selectActivity(Activity activity) {
        return activityDao.selectActivity(activity);
    }
}
