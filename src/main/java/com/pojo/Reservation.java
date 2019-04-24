package com.pojo;

import java.util.Date;

/**
 * @Author jhao
 * @Date 2019/4/23 11:12
 * @Description
 * @Modified by:
 */
public class Reservation {

    private String studentName;
    private String memberName;
    private Date dates;
    private int id;
    private boolean wasFinish;
    private String context;
    private int studentId;
    private int memberId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isWasFinish() {
        return wasFinish;
    }

    public void setWasFinish(boolean wasFinish) {
        this.wasFinish = wasFinish;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "studentName='" + studentName + '\'' +
                ", memberName='" + memberName + '\'' +
                ", dates=" + dates +
                ", id=" + id +
                ", wasFinish=" + wasFinish +
                ", context='" + context + '\'' +
                ", studentId=" + studentId +
                ", memberId=" + memberId +
                '}';
    }
}
