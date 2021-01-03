package lk.ijse.royal.dao.custom;

import lk.ijse.royal.dao.CrudDAO;
import lk.ijse.royal.dao.SupperDAO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.Student;

import java.util.List;

public interface CourseDAO extends CrudDAO<Course , String> {
    public Course getCourse(int selectedID);
}
