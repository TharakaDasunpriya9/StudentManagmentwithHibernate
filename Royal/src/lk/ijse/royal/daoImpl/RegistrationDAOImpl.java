package lk.ijse.royal.daoImpl;

import lk.ijse.royal.dao.custom.RegistrationDAO;
import lk.ijse.royal.entity.Registration;
import lk.ijse.royal.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class RegistrationDAOImpl implements RegistrationDAO {

    private SessionFactory sessionFactory;

    public RegistrationDAOImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    @Override
    public boolean save(Registration entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            Serializable save = session.save(entity);
            session.getTransaction().commit();
            System.out.println("save = " + save);
            return save != null;
        }
    }

    @Override
    public boolean update(Registration entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Registration entity) throws Exception {
        return false;
    }

    @Override
    public Registration search(String s) throws Exception {
        return null;
    }

    @Override
    public List<Registration> getAll() {
        return null;
    }
}
