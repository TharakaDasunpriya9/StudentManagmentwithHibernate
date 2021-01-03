package lk.ijse.royal.bo.custom.impl;

import lk.ijse.royal.dao.DAOFactory;
import lk.ijse.royal.dao.custom.RegistrationDAO;
import lk.ijse.royal.dto.RegistrationDTO;
import lk.ijse.royal.bo.custom.RegistrationBO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.Registration;
import lk.ijse.royal.entity.Student;

import java.util.List;

public class RegistrationBOImpl implements RegistrationBO {

    private RegistrationDAO registrationDAO;


    public RegistrationBOImpl() {
        registrationDAO = (RegistrationDAO) DAOFactory.getInstance().getRepo(DAOFactory.RepoType.REGISTRATION);
    }

    @Override
    public boolean placeRegistration(RegistrationDTO registrationDTO) throws Exception {

                registrationDAO.save(new Registration(registrationDTO.getRegID(),registrationDTO.getRegDate(),registrationDTO.getRegFee(),new Student() ,new Course()));
        return false;
    }

    @Override
    public List<RegistrationDTO> getAllRegistrations() {
        return null;

    }
}
