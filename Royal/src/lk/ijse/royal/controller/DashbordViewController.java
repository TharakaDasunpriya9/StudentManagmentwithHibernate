package lk.ijse.royal.controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class DashbordViewController {
//public AnchorPane pane;
    private Stage stage = new Stage();

    public void btnStudent(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(StudentViewController.class.getResource("/lk/ijse/royal/view/StudentView.fxml"));
        Scene temp = new Scene(root);
//        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setScene(temp);
        stage.show();
    }

    public void btnCourse(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(CourseViewController.class.getResource("/lk/ijse/royal/view/CourseView.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }

    public void btnRegistration(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(RegistrationViewController.class.getResource("/lk/ijse/royal/view/RegistrationView.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }

    @FXML
    private JFXButton btnStudent;

    @FXML
    private JFXButton btnCourse;

    @FXML
    private JFXButton btnRegistration;

}
