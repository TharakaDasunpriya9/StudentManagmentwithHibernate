package lk.ijse.royal.bo.custom;

import lk.ijse.royal.dto.StudentDTO;
import lk.ijse.royal.entity.Student;

import java.util.List;

public interface StudentBO {

    public boolean addStudent(StudentDTO student) throws Exception;

    public boolean UpdateStudent(StudentDTO student) throws Exception;

    public boolean removeStudent(StudentDTO student) throws Exception;

    public Student SearchStudent(int id) throws Exception;

    public List<StudentDTO> getAllStudent() throws Exception;

    public String getStudentDT(int selectedID);

}
