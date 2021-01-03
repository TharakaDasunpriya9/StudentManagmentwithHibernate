import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.royal.dao.custom.StudentDAO;
import lk.ijse.royal.daoImpl.StudentDAOImpl;
import lk.ijse.royal.dto.StudentDTO;
import lk.ijse.royal.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StartUp extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/royal/view/DashbordView.fxml"));
        Scene temp = new Scene(root);
        primaryStage.setScene(temp);
        primaryStage.setTitle("Dashboard Form");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

//        Transaction tx = null;
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            tx = session.beginTransaction();
//
////            StudentDAOImpl.
////
////            tx.commit();
//        }catch (Throwable t){
//            t.printStackTrace();
//            tx.rollback();
//        }



}
