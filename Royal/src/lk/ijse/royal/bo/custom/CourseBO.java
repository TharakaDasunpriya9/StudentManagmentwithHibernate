package lk.ijse.royal.bo.custom;

import lk.ijse.royal.dto.CourseDTO;
import lk.ijse.royal.entity.Student;

import java.util.List;

public interface CourseBO
{
    public boolean addCourse(CourseDTO course) throws Exception;

    public boolean updateCourse(CourseDTO course) throws Exception;

    public boolean removeCourse(CourseDTO course) throws Exception;

    public Student searchCourse(int id) throws Exception;

    public List<CourseDTO> getAllCourse() throws Exception;

    public String getCourseDT(int selectedID);
}
