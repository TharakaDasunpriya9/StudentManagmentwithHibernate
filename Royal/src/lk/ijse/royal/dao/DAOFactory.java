package lk.ijse.royal.dao;

import lk.ijse.royal.daoImpl.CourseDAOImpl;
import lk.ijse.royal.daoImpl.RegistrationDAOImpl;
import lk.ijse.royal.daoImpl.StudentDAOImpl;

public class DAOFactory {
    public enum RepoType {
        STUDENT, COURSE, REGISTRATION;
    }

    public static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public <T>T getRepo(RepoType repoType) {
        switch (repoType) {
            case STUDENT:
                return (T) new StudentDAOImpl();
            case COURSE:
                return (T) new CourseDAOImpl();
            case REGISTRATION:
                return (T) new RegistrationDAOImpl();
            default:
                return null;
        }
    }
}
