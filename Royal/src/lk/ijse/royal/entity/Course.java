package lk.ijse.royal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course implements SuperEntity {
    @Id
    private String code;
    private String courseName;
    private String courseType;
    private String duration;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Registration> registrations1 = new ArrayList<>();

    public Course() {
    }

    public Course(String code, String courseName, String courseType, String duration) {
        this.code = code;
        this.courseName = courseName;
        this.courseType = courseType;
        this.duration = duration;
    }

    public Course(String courseID) {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Registration> getRegistrations1() {
        return registrations1;
    }

    public void setRegistrations1(List<Registration> registrations1) {
        this.registrations1 = registrations1;
    }
}
