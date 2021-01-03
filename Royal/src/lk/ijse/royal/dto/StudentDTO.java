package lk.ijse.royal.dto;

import java.io.Serializable;
import java.util.Date;

public class StudentDTO implements Serializable {
    private String id;
    private String studentName;
    private String address;
    private int contact;
    private Date dob;
    private String gender;

    public StudentDTO() {
    }

    public StudentDTO(String id, String studentName, String address, int contact, Date dob, String gender) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id='" + id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                '}';

    }
}
