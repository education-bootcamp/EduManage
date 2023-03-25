package com.developersstack.edumanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CodeVerificationFormController {
    public AnchorPane context;
    public TextField txtCode;
    public Label txtSelectedEmail;
    int code = 0;

    public void setUserData(int verificationCode, String email) {
        System.out.println(verificationCode);
        code = verificationCode;
        txtSelectedEmail.setText(email);
    }

    public void verifyCodeOnAction(ActionEvent actionEvent) {
        if (
                String.valueOf(code).equals(txtCode.getText())
        ){
            // navigate reset pwd
        }else{
            new Alert(Alert.AlertType.ERROR, "Wrong Verification Code").show();
        }
    }

    public void changeEmailOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ForgotPasswordForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
        stage.centerOnScreen();
    }
}
