package com.developersstack.edumanage.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DashboardFormController {
    public AnchorPane context;
    public Label lblDate;
    public Label lblTime;

    public void initialize(){
        setData();
    }

    private void setData() {
        /*Date date = new Date(); // util
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 2023-03-20
        String textDate = dateFormat.format(date);
        lblDate.setText(textDate);*/
        lblDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    public void logOutOnAction(ActionEvent actionEvent) {
    }
}
