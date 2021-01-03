package lk.ijse.royal.dao.custom;

import lk.ijse.royal.dao.CrudDAO;
import lk.ijse.royal.entity.Student;

public interface StudentDAO extends CrudDAO<Student,Integer> {
    public Student getStudent(int selectedID);
}
