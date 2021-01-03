package lk.ijse.royal.daoImpl;
import lk.ijse.royal.dao.custom.StudentDAO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.Student;
import lk.ijse.royal.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private SessionFactory sessionFactory ;

    public StudentDAOImpl(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Student getStudent(int selectedID) {
        return null;
    }

    @Override
    public boolean save(Student entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            Serializable save = session.save(entity);
            session.getTransaction().commit();
            System.out.println("save = " + save);
            return save != null;
        }
    }

    @Override
    public boolean update(Student entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Student entity) throws Exception {
        return false;
    }

    @Override
    public Student search(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Student> getAll() throws Exception {

        try (Session session = sessionFactory.openSession()) {
            Criteria criteria = session.createCriteria(Student.class);
            List<Student> list = criteria.list();
            session.close();
            return list;
        } catch (Exception ex) {
            System.out.println("Exeption: " + ex);
        }
        return null;
    }
}
