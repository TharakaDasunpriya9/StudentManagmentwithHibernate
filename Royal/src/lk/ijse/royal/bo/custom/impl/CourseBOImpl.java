package lk.ijse.royal.bo.custom.impl;

import lk.ijse.royal.dao.DAOFactory;
import lk.ijse.royal.dao.custom.CourseDAO;
import lk.ijse.royal.dto.CourseDTO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.Student;
import lk.ijse.royal.bo.custom.CourseBO;

import java.util.ArrayList;
import java.util.List;

public class CourseBOImpl implements CourseBO {

    private CourseDAO courseDAO;

    public CourseBOImpl() {

        courseDAO = (CourseDAO) DAOFactory.getInstance().getRepo(DAOFactory.RepoType.COURSE);
    }
    @Override
    public boolean addCourse(CourseDTO course) throws Exception {
        return courseDAO.save(new Course(course.getCode(),course.getCourseName(),course.getCourseType(),course.getDuration()));
        //return courseDAO.save(new Course("C001","AA","djhsdjjk","10"));
    }

    @Override
    public boolean updateCourse(CourseDTO course) throws Exception {
        return courseDAO.update(new Course(course.getCode(),course.getCourseName(),course.getCourseType(),course.getDuration()));
    }

    @Override
    public boolean removeCourse(CourseDTO course) throws Exception {
        return courseDAO.delete(new Course(course.getCode(),course.getCourseName(),course.getCourseType(),course.getDuration()));
    }

    @Override
    public Student searchCourse(int id) throws Exception {
        return null;
    }

    @Override
    public List<CourseDTO> getAllCourse() throws Exception {
        List<CourseDTO> courseDTOS = new ArrayList<>();
        List<Course> allCustomer = courseDAO.getAll();
        for (Course customer : allCustomer) {
            CourseDTO customerDTO = new CourseDTO(customer.getCode(), customer.getCourseName(), customer.getCourseType(), customer.getDuration());
            courseDTOS.add(customerDTO);
        }
        return courseDTOS;
    }

    @Override
    public String getCourseDT(int selectedID) {

        Course courseDT=courseDAO.getCourse(selectedID);

        String name=courseDT.getCourseName();

        return name;
    }
}
