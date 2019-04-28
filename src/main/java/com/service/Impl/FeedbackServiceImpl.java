package com.service.Impl;

import com.dao.FeedbackDao;
import com.dao.ReservationDao;
import com.pojo.Feedback;
import com.pojo.Reservation;
import com.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/28 13:00
 * @Description
 * @Modified by:
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackDao feedbackDao;

    @Autowired
    ReservationDao reservationDao;

    @Override
    @Transactional
    public int insertFeedback(Feedback feedback) {
        Reservation reservation = new Reservation();
        reservation.setWasFinish(true);
        reservation.setId(feedback.getReservationId());
        int result = reservationDao.updateReservation(reservation);
        if(result==1){
            return feedbackDao.insertFeedback(feedback);
        }else{
            return 0;
        }

    }

    @Override
    public int deleteFeedback(Feedback feedback) {
        return feedbackDao.deleteFeedback(feedback);
    }

    @Override
    public int updateFeedback(Feedback feedback) {
        return feedbackDao.updateFeedback(feedback);
    }

    @Override
    public List<Feedback> listAllFeedback() {
        return feedbackDao.listAllFeedback();
    }

    @Override
    public List<Feedback> listAllFeedbackForOneMember(Feedback feedback) {
        return feedbackDao.listAllFeedbackForOneMember(feedback);
    }

    @Override
    public List<Feedback> listAllFeedbackForOneStudent(Feedback feedback) {
        return feedbackDao.listAllFeedbackForOneStudent(feedback);
    }

    @Override
    public List<Feedback> selectOneFeedbackByReservationId(Feedback feedback) {
        return feedbackDao.selectOneFeedbackByReservationId(feedback);
    }
}
