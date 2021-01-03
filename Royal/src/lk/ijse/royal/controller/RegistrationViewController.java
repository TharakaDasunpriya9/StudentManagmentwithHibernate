package lk.ijse.royal.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import lk.ijse.royal.bo.BOFactory;
import lk.ijse.royal.bo.custom.RegistrationBO;
import lk.ijse.royal.bo.custom.impl.StudentBOImpl;
import lk.ijse.royal.dto.RegistrationDTO;
import lk.ijse.royal.dto.StudentDTO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.entity.Student;
import lk.ijse.royal.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class RegistrationViewController implements Initializable {

    @FXML
    private JFXTextField txtRegNo;

    @FXML
    private DatePicker txtDate1;

    @FXML
    private JFXTextField txtFee;

    @FXML
    private JFXTextField txtStudentID;

    @FXML
    private JFXTextField txtCode;


    private RegistrationBO registrationBO;
    private SessionFactory sessionFactory;

    private Stage stage = new Stage();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        registrationBO = BOFactory.getInstance().getBO(BOFactory.BOType.REGISTRATION);

    }

    @FXML
    void btnAdd(ActionEvent event) throws Exception {
//        String no = txtRegNo.getText();
//        double fee = Double.parseDouble(txtFee.getText());
//        String sID = txtStudentID.getText();
//        String code = txtCode.getText();
//        java.util.Date date = java.sql.Date.valueOf(txtDate1.getValue());
//        RegistrationDTO registrationDTO = new RegistrationDTO(no, date,fee, sID, code);
//        try{
//            boolean isAdded = registrationBO.placeRegistration(registrationDTO);
//            System.out.println("isAdded = " + isAdded);
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }

    void btnRemove(ActionEvent event) {

    }

    void loadAllStudentID() throws Exception {
        StudentBOImpl studentBO = new StudentBOImpl();
        List<String> allID = new ArrayList<>();
        List<StudentDTO> allStudent = studentBO.getAllStudent();
        for (StudentDTO student : allStudent){
            allID.add(student.getId());
        }
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(DashbordViewController.class.getResource("/lk/ijse/royal/view/DashbordView.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }
}
