package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button BtnLogin;
    public TextField UserID;
    public PasswordField PassField;
    public Label LblDispMsg;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void userLogin(ActionEvent actionEvent) {

        String userName=UserID.getText();
        String password=PassField.getText();
        LblDispMsg.setText(userName);

    }
}
