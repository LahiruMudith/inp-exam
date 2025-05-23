package org.example.chatapplication.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.chatapplication.HelloApplication;

import java.io.IOException;

public class LoginController {
    private static String username = "user";
    private static String password = "1234";

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnLogin(ActionEvent event) {
        if (txtPassword.getText().equals(password) && txtUsername.getText().equals(username)){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/org/example/chatapplication/view/server.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load(), 618.0, 442);
                stage.setTitle("Server!");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            new Alert(Alert.AlertType.ERROR, "Invalid User Details");
        }
    }

}
