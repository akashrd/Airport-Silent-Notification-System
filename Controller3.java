package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {
    public TextArea NotifyFlight;
    public TextArea NotifyText;
    public Button BtnManualNotify;
    public Button BtnBack;
    public Button BtnSignOut;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void manualResolve(ActionEvent actionEvent) {
        String Fid;
        String FlightMsg;
        Fid=NotifyFlight.getText();
        FlightMsg=NotifyText.getText();
        Problem p2=new Problem(FlightMsg,Fid);
        p2.resolveProblem(Fid,FlightMsg);
    }

    public void SignOut(ActionEvent actionEvent)throws Exception {

        Parent root3= FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene1=new Scene(root3, 300, 300);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();

    }

    public void OnBack(ActionEvent actionEvent) throws Exception{
        Parent root5 = null;
        try
        {
            root5=FXMLLoader.load(getClass().getResource("sample2.fxml"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        Scene scene3 = new Scene(root5, 600, 600);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene3);
        window.show();
    }
}
