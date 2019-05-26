package com.service.Impl;

import com.dao.ReservationDao;
import com.pojo.Reservation;
import com.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/23 11:20
 * @Description
 * @Modified by:
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationDao reservationDao;

    @Override
    public List<Reservation> listAllReservation() {
        /**
         * @Description
         * @author      jhao
         * @param       []
         * @return      java.util.List<com.pojo.Reservation>
         * @exception   
         * @date        2019/4/23 15:01
         */
        return reservationDao.listAllReservation();
    }

    @Override
    public List<Reservation> listAllReservationByMemberId(Reservation reservation) {
        /**
         * @Description
         * @author      jhao
         * @param       [reservation]
         * @return      java.util.List<com.pojo.Reservation>
         * @exception   
         * @date        2019/4/23 14:50
         */
        return reservationDao.listAllReservationByMemberId(reservation);
    }

    @Override
    public List<Reservation> listAllReservationByStudentId(Reservation reservation) {
        /**
         * @Description
         * @author      jhao
         * @param       [reservation]
         * @return      java.util.List<com.pojo.Reservation>
         * @exception   
         * @date        2019/4/23 14:50
         */
        return reservationDao.listAllReservationByStudentId(reservation);
    }

    @Override
    public int createReservation(Reservation reservation) {
        /**
         * @Description
         * @author      jhao
         * @param       [reservation]
         * @return      int
         * @exception   
         * @date        2019/4/23 14:50
         */
        return reservationDao.createReservation(reservation);
    }

    @Override
    public int deleteReservation(Reservation reservation) {
        /**
         * @Description
         * @author      jhao
         * @param       [reservation]
         * @return      int
         * @exception   
         * @date        2019/4/23 14:50
         */
        return reservationDao.deleteReservation(reservation);
    }

    @Override
    public int updateReservation(Reservation reservation) {
        /**
         * @Description
         * @author      jhao
         * @param       [reservation]
         * @return      int
         * @exception   
         * @date        2019/4/23 14:50
         */
        return reservationDao.updateReservation(reservation);
    }

    @Override
    public Reservation getReservation(Reservation reservation) {
        /**
         * @Description
         * @author      jhao
         * @param       [reservation]
         * @return      com.pojo.Reservation
         * @exception   
         * @date        2019/4/23 14:50
         */
        return reservationDao.getReservation(reservation);
    }

    @Override
    public int finish(Reservation reservation) {
        return reservationDao.finish(reservation);
    }

    @Override
    public int acception(Reservation reservation) {
        return reservationDao.acception(reservation);
    }
}
