package lk.ijse.royal.tbm;

import java.io.Serializable;
import java.util.Date;

public class RegistrationTM implements Serializable {
    private String studentId;
    private String courseId;
    private String regID;
    private Date regDate;
    private double regFee;

    public RegistrationTM() {
    }

    public RegistrationTM(String studentId, String courseId, String regID, Date regDate, double regFee) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.regID = regID;
        this.regDate = regDate;
        this.regFee = regFee;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    @Override
    public String toString() {
        return "RegistrationTM{" +
                "studentId='" + studentId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", regID='" + regID + '\'' +
                ", regDate=" + regDate +
                ", regFee=" + regFee +
                '}';
    }
}
