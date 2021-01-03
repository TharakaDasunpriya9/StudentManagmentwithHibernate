package lk.ijse.royal.bo.custom;

import lk.ijse.royal.dto.RegistrationDTO;

import java.util.List;

public interface RegistrationBO {

    public boolean placeRegistration(RegistrationDTO registrationDTO) throws Exception;

    public List<RegistrationDTO> getAllRegistrations();
}
