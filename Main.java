package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root, 400, 400);
        primaryStage.setTitle("Airport Notification System");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
   //     sample.DBconnect connect =new sample.DBconnect();
     //   connect.getData();
//        Airport objAir=new Airport();
//        objAir.initializeData();
//        Problem p1=new Problem();
//        p1.generateProblem(objAir);
//        JavaMail objMail=new JavaMail();
//
//        ArrayList<String> emailS =new ArrayList<String>(10);
//        emailS.add("gauri.nigam@sitpune.edu.in");
//        emailS.add("bhoomika.jethwani@sitpune.edu.in");
//        emailS.add("gauri.nigam@sitpune.edu.in");
//        emailS.add("bhoomika.jethwani@sitpune.edu.in");
//        emailS.add("gauri.nigam@sitpune.edu.in");
//        emailS.add("bhoomika.jethwani@sitpune.edu.in");
//        emailS.add("gauri.nigam@sitpune.edu.in");
//        emailS.add("bhoomika.jethwani@sitpune.edu.in");
//        emailS.add("gauri.nigam@sitpune.edu.in");
//        emailS.add("bhoomika.jethwani@sitpune.edu.in");
//
//
//        objMail.sendMail(p1.Statement,emailS);
//
//       // System.out.println(p1.Statement);
//
//

    }
}
