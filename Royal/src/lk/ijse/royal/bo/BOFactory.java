package lk.ijse.royal.bo;

import lk.ijse.royal.bo.custom.impl.CourseBOImpl;
import lk.ijse.royal.bo.custom.impl.RegistrationBOImpl;
import lk.ijse.royal.bo.custom.impl.StudentBOImpl;

public class BOFactory {

    public static BOFactory BOFactory;

    private BOFactory() {
    }

    public enum BOType {
        STUDENT, COURSE, REGISTRATION
    }


    public static BOFactory getInstance() {
        if (BOFactory == null) {
            BOFactory = new BOFactory();
        }
        return BOFactory;
    }

    public <T> T getBO(BOType serviceType) {
        switch (serviceType) {
            case STUDENT:
                return (T) new StudentBOImpl();
            case COURSE:
                return (T) new CourseBOImpl();
            case REGISTRATION:
                return (T) new RegistrationBOImpl();
            default:
                return null;
        }
    }


}
