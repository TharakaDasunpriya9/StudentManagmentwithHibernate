package lk.ijse.royal.controller;

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
import lk.ijse.royal.bo.custom.CourseBO;
import lk.ijse.royal.dto.CourseDTO;
import lk.ijse.royal.dto.StudentDTO;
import lk.ijse.royal.entity.Course;
import lk.ijse.royal.tbm.CourseTM;
import lk.ijse.royal.tbm.StudentTM;
import lk.ijse.royal.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CourseViewController implements Initializable {


    @FXML
    private TableView<CourseTM> tblCourse;


    @FXML
    private JFXTextField txtCode;

    @FXML
    private JFXTextField txtCourseName;

    @FXML
    private JFXTextField txtType;

    @FXML
    private JFXTextField txtDuration;


    private CourseBO courseBO;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        courseBO = BOFactory.getInstance().getBO(BOFactory.BOType.COURSE);


        configureTable();
        loadAllCourses();
    }

    @FXML
    void btnAdd(ActionEvent event) {
        String code = txtCode.getText();
        String name = txtCourseName.getText();
        String type = txtType.getText();
        String duration = txtDuration.getText();

        CourseDTO course = new CourseDTO(code,name,type,duration);
        try {
            boolean isAdded = courseBO.addCourse(course);
            loadAllCourses();
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
    private void loadAllCourses() {
        try {

            ObservableList<CourseTM> courseTMList = FXCollections.observableArrayList();


            List<CourseDTO> allCourse = courseBO.getAllCourse();
            System.out.println("allCourse = " + allCourse);

            for (CourseDTO courseDTO : allCourse) {

                CourseTM courseTM = new CourseTM(
                        courseDTO.getCode(),
                        courseDTO.getCourseName(),
                        courseDTO.getCourseType(),
                        courseDTO.getDuration()

                );
                courseTMList.add(courseTM);
            }
            tblCourse.setItems(courseTMList);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    private void configureTable(){
        tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("code"));
        tblCourse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("courseName"));
        tblCourse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("courseType"));
        tblCourse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("duration"));

    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(DashbordViewController.class.getResource("/lk/ijse/royal/view/DashbordView.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }
}
