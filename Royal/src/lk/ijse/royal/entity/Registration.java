package lk.ijse.royal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Registration implements SuperEntity {
    @Id
    private String regID;
    private Date regDate;
    private double regFee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentID",referencedColumnName = "id",nullable = false)
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseID",referencedColumnName = "code",nullable = false)
    private Course course;

    public Registration(String regID, Date regDate, double regFee, Student student, Course course) {
        this.regID = regID;
        this.regDate = regDate;
        this.regFee = regFee;
        this.student = student;
        this.course = course;
    }

}
