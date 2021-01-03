package lk.ijse.royal.dao.custom;

import lk.ijse.royal.dao.CrudDAO;
import lk.ijse.royal.dao.SupperDAO;
import lk.ijse.royal.entity.Registration;
import lk.ijse.royal.entity.Student;

import java.util.List;

public interface RegistrationDAO extends CrudDAO<Registration ,String> {
    public boolean save(Registration entity) throws Exception;

    public List<Registration> getAll();
}
