package com.pojo;

/**
 * @Author jhao
 * @Date 2019/4/28 13:02
 * @Description
 * @Modified by:
 */
public class Feedback {
    private String feedbacks;
    private String studentName;
    private String memberName;
    private int reservationId;
    private int studentId;
    private int memberId;

    public String getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(String feedbacks) {
        this.feedbacks = feedbacks;
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

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

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

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbacks='" + feedbacks + '\'' +
                ", studentName='" + studentName + '\'' +
                ", memberName='" + memberName + '\'' +
                ", reservationId=" + reservationId +
                ", studentId=" + studentId +
                ", memberId=" + memberId +
                '}';
    }
}
