package com.service;

import com.pojo.Reservation;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/23 11:19
 * @Description
 * @Modified by:
 */
public interface ReservationService{

    //获取所有的预约
    List<Reservation> listAllReservation();

    //通过咨询师id获取ta的所以预约
    List<Reservation> listAllReservationByMemberId(Reservation reservation);

    //通过学生id获取ta的所有预约
    List<Reservation> listAllReservationByStudentId(Reservation reservation);

    //添加预约
    int createReservation(Reservation reservation);

    //删除预约 通过id作为扫描依据删除预约
    int deleteReservation(Reservation reservation);

    //修改预约 通过id作为扫描依据修改预约
    int updateReservation(Reservation reservation);

    //管理员获取所有预约
    Reservation getReservation(Reservation reservation);

    //咨询师完成咨询
    int finish(Reservation reservation);

    //咨询师接受咨询
    int acception(Reservation reservation);
}
