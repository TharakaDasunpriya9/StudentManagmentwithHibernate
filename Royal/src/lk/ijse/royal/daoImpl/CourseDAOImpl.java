package lk.ijse.royal.daoImpl;

import lk.ijse.royal.dao.custom.CourseDAO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.SuperEntity;
import lk.ijse.royal.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {


    private SessionFactory sessionFactory;

    public CourseDAOImpl() {

        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Course getCourse(int selectedID) {

        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            Course course=session.get(Course.class,selectedID);
            session.getTransaction().commit();
            return new Course(course.getCourseName());
        } catch (Exception ex) {
            System.out.println("Exeption: " + ex);
        }
        return null;
    }

    @Override
    public boolean save(Course entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            Serializable save = session.save(entity);
            session.getTransaction().commit();
            System.out.println("save = " + save);
            return save != null;
        }
    }

    @Override
    public boolean update(Course entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean delete(Course entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.remove(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Course search(String s) throws Exception {
        return null;
    }


    @Override
    public List getAll() throws Exception {

        try (Session session = sessionFactory.openSession()) {
            Criteria criteria = session.createCriteria(Course.class);
            List<Course> list = criteria.list();
            session.close();
            return list;
        } catch (Exception ex) {
            System.out.println("Exeption: " + ex);
        }
        return null;
    }
}
