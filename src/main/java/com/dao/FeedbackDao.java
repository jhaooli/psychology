package com.dao;

import com.pojo.Feedback;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/28 12:59
 * @Description
 * @Modified by:
 */
public interface FeedbackDao {

    /**
     * @Description 新增反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:01
     */
    int insertFeedback(Feedback feedback);

    /**
     * @Description 删除反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:04
     */
    int deleteFeedback(Feedback feedback);

    /**
     * @Description 修改反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:04
     */
    int updateFeedback(Feedback feedback);

    /**
     * @Description 获取所有的反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:05
     */
    List<Feedback> listAllFeedback();

    /**
     * @Description 获取某个咨询师所有的反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:05
     */
    List<Feedback> listAllFeedbackForOneMember(Feedback feedback);

    /**
     * @Description 获取某个用户所有的心理反馈
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:07
     */
    List<Feedback> listAllFeedbackForOneStudent(Feedback feedback);

    /**
     * @Description 找单独一条反馈 通过预约id
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/28 13:08
     */
    List<Feedback> selectOneFeedbackByReservationId(Feedback feedback);
}
