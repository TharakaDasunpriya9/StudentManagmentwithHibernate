package lk.ijse.royal.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable {
    private String code;
    private String courseName;
    private String courseType;
    private String duration;

    public CourseDTO() {
    }

    public CourseDTO(String code, String courseName, String courseType, String duration) {
        this.code = code;
        this.courseName = courseName;
        this.courseType = courseType;
        this.duration = duration;
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

    @Override
    public String toString() {
        return "CourseDTO{" +
                "code='" + code + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
