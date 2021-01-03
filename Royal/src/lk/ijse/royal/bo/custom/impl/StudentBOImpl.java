package lk.ijse.royal.bo.custom.impl;

import lk.ijse.royal.dao.DAOFactory;
import lk.ijse.royal.dao.custom.StudentDAO;
import lk.ijse.royal.dto.StudentDTO;
import lk.ijse.royal.entity.Student;
import lk.ijse.royal.bo.custom.StudentBO;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    private final StudentDAO studentDAO;

    public StudentBOImpl() {
        studentDAO = DAOFactory.getInstance().getRepo(DAOFactory.RepoType.STUDENT);
    }

    @Override
    public boolean addStudent(StudentDTO student) throws Exception {
        return studentDAO.save(new Student(
                        student.getId(),
                        student.getStudentName(),
                        student.getAddress(),
                        student.getContact(),
                        student.getDob(),
                        student.getGender()
                )
        );
    }

    @Override
    public boolean UpdateStudent(StudentDTO student) throws Exception {
        return studentDAO.update(new Student(student.getId(), student.getStudentName(),
                student.getAddress(), student.getContact(), student.getDob(), student.getGender()));
    }

    @Override
    public boolean removeStudent(StudentDTO student) throws Exception {
        return studentDAO.delete(new Student(student.getId(), student.getStudentName(),
                student.getAddress(), student.getContact(), student.getDob(), student.getGender()));
    }

    @Override
    public Student SearchStudent(int id) throws Exception {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudent() throws Exception {
        List<StudentDTO> studentDTOS = new ArrayList<>();
        List<Student> allCustomer = studentDAO.getAll();
        for (Student student : allCustomer) {
            StudentDTO studentDTO = new StudentDTO(student.getId(), student.getStudentName(), student.getAddress(), student.getContact(), student.getDob(), student.getGender());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    @Override
    public String getStudentDT(int selectedID) {

        Student studentDT = studentDAO.getStudent(selectedID);

        String name = studentDT.getStudentName();

        return name;
    }
}
