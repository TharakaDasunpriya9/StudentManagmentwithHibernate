package lk.ijse.royal.dto;

import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.Student;

import java.io.Serializable;
import java.util.Date;

public class RegistrationDTO implements Serializable {
    private String regID;
    private Date regDate;
    private double regFee;
    private Student student;
    private Course course;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String regID, Date regDate, double regFee, Student student, Course course) {
        this.regID = regID;
        this.regDate = regDate;
        this.regFee = regFee;
        this.student = student;
        this.course = course;
    }

    public RegistrationDTO(String no, String fee, String selectedItem1, String selectedItem2, Date date) {


    }

    public Student getStudentID() {
        return student;
    }

    public void setStudentID(Student student) {
        this.student = student;
    }

    public Course getCourseID() {
        return course;
    }

    public void setCourseID(Course course) {
        this.course = course;
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
        return "RegistrationDTO{" +
                "regID='" + regID + '\'' +
                ", regDate=" + regDate +
                ", regFee=" + regFee +
                '}';
    }
}
