package com.developersstack.edumanage.controller;

import com.developersstack.edumanage.util.tools.VerificationCodeGenerator;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

public class ForgotPasswordFormController {
    public AnchorPane context;
    public TextField txtEmail;

    public void backToLoginPage(ActionEvent actionEvent) throws IOException {
        setUi("LoginForm");
    }

    public void sendCodeOnAction(ActionEvent actionEvent) {
        try {
            int verificationCode = new VerificationCodeGenerator().getCode(5);

            String fromEmail = "education.seekerscloud@gmail.com";
            String toEmail = txtEmail.getText();
            String host = "127.0.0.1";

            Properties properties = System.getProperties();
            properties.setProperty("mail.smtp.host", host);
            properties.setProperty("mail.smtp.port","587");
            // => node=> nodemailer, (sendGrid, twilio)
            Session session = Session.getDefaultInstance(properties);

            //-------------------------
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(fromEmail));
            mimeMessage.setSubject("Verification Code");
            mimeMessage.setText("Verification Code : " + verificationCode);
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

            //Transport.send(mimeMessage);
            System.out.println("Completed!");
            //=======================>

            FXMLLoader fxmlLoader =
                    new FXMLLoader(getClass().getResource("../view/CodeVerificationForm.fxml"));
            Parent parent = fxmlLoader.load();
            CodeVerificationFormController controller = fxmlLoader.getController();
            controller.setUserData(verificationCode,txtEmail.getText());
            Stage stage =(Stage) context.getScene().getWindow();
            stage.setScene(new Scene(parent));

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
        stage.centerOnScreen();
    }
}
