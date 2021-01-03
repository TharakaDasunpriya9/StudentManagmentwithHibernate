package lk.ijse.royal.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lk.ijse.royal.bo.BOFactory;
import lk.ijse.royal.bo.custom.StudentBO;
import lk.ijse.royal.dto.StudentDTO;
import lk.ijse.royal.entity.Student;
import lk.ijse.royal.tbm.StudentTM;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {

    @FXML
    private JFXTextField txtSID;

    @FXML
    private JFXTextField txtStudentName;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXComboBox<String> cmbGender;

    @FXML
    private JFXDatePicker calenderDOB;
    @FXML
    private TableView<StudentTM> tableStudent;


    private StudentBO studentBO;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentBO = BOFactory.getInstance().getBO(BOFactory.BOType.STUDENT);

        String[] gender = {"MALE", "FEMALE", "CUSTOM"};
        cmbGender.getItems().addAll(gender);

        configureTable();
        loadAllStudents();
    }

    @FXML
    void btnAdd(ActionEvent event) {
        String sid = txtSID.getText();
        String studentName = txtStudentName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();
        String selectedItem = cmbGender.getSelectionModel().getSelectedItem();

        java.util.Date date = java.sql.Date.valueOf(calenderDOB.getValue());
        StudentDTO student = new StudentDTO(
                sid,
                studentName,
                address,
                Integer.parseInt(contact),
                date,
                selectedItem
        );
        System.out.println("student = " + student);
        try {
            boolean isAdded = studentBO.addStudent(student);
            loadAllStudents();
            System.out.println("isAdded = " + isAdded);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }


    @FXML
    void btnDelete(ActionEvent event) {

    }


    @FXML
    void btnUpdate(ActionEvent event) {

    }
    private Stage stage = new Stage();
    private void loadAllStudents() {
        try {

            ObservableList<StudentTM> studentTMList = FXCollections.observableArrayList();


            List<StudentDTO> allStudent = studentBO.getAllStudent();
            System.out.println("allStudent = " + allStudent);

            for (StudentDTO studentDTO : allStudent) {

                StudentTM studentTM = new StudentTM(
                        studentDTO.getId(),
                        studentDTO.getStudentName(),
                        studentDTO.getAddress(),
                        studentDTO.getContact(),
                        studentDTO.getDob(),
                        studentDTO.getGender()
                );
                studentTMList.add(studentTM);

            }
            tableStudent.setItems(studentTMList);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void configureTable(){
        tableStudent.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tableStudent.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("studentName"));
        tableStudent.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tableStudent.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contact"));
        tableStudent.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("dob"));
        tableStudent.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("gender"));
    }


    public void tbnBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(DashbordViewController.class.getResource("/lk/ijse/royal/view/DashbordView.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }
}
