package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button BtnLogin;
    public TextField UserID;
    public PasswordField PassField;
    public Label LblDispMsg;
    public TextField NotifyFlight;
    public TextField NotifyText;
    public Button BtnManualNotify;
    private Problem p1;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //code to initialize usernames and passwords arraylist from the database

    }

    public void userLogin(ActionEvent actionEvent)throws IOException {
        ArrayList<String> Usernames = new ArrayList<>();
        ArrayList<String> Passwords = new ArrayList<>();
        DBconnect obj=new DBconnect();

        Usernames=obj.getData("users","Username");
        Passwords=obj.getData("users","Password");



        int flag=1;
        int flag1=1;
        String userName = UserID.getText();
        String password = PassField.getText();

        for (String usrname : Usernames)
        {
            if(userName.equals(usrname))
            {
                flag=0;
                break;
            }

        }
        if(flag==0)
        {
            for(String pass:Passwords)
            {
                if(password.equals(pass))
                {
                    flag1=0;
                    break;
                }
            }
        }
        if(flag==0 && flag1==0) {
            LblDispMsg.setText("Logged in successfully");

//            Main obj=new Main();
//            obj.sceneBanao("sample2.fxml");

            Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Parent root1= null;
        try {
            root1 = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene2= new Scene(root1, 400, 400);
            window.setScene(scene2);
            window.show();

            Airport objAir=new Airport();
            objAir.initializeData();
            p1=new Problem();
            p1.generateProblem(objAir);


        }




    }

    public void SignOut(ActionEvent actionEvent)throws Exception{


        Parent root3= FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root3, 400, 400);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();
    }

    public void ProblemPage(ActionEvent actionEvent)throws Exception{

        Parent root4 = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        Scene scene3 = new Scene(root4, 400, 400);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene3);
        window.show();
    }



    public void ResolveNow(ActionEvent actionEvent) {
        p1.resolveProblem();


    }

    public void manualResolve(ActionEvent actionEvent) {
        String Fid;
        String FlightMsg;
        Fid=NotifyFlight.getText();
        FlightMsg=NotifyText.getText();
        Problem p2=new Problem(FlightMsg, Fid);
        p2.resolveProblem();
    }
}

