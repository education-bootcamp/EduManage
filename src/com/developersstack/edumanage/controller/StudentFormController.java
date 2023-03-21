package com.developersstack.edumanage.controller;

import com.developersstack.edumanage.db.Database;
import com.developersstack.edumanage.model.Student;
import com.developersstack.edumanage.view.tm.StudentTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;

public class StudentFormController {
    public AnchorPane context;
    public TextField txtId;
    public TextField txtName;
    public DatePicker txtDob;
    public TextField txtAddress;
    public TableView<StudentTm> tblStudents;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colDob;
    public TableColumn colAddress;
    public TableColumn colOption;

    public void initialize(){
        setStudentId();
        setTableData();
    }

    private void setTableData() {
        ObservableList<StudentTm> obList = FXCollections.observableArrayList();
        for (Student st:Database.studentTable
             ) {
            Button btn= new Button("Delete");
            StudentTm tm = new StudentTm(
                    st.getStudentId(),
                    st.getFullName(),
                    new SimpleDateFormat("yyyy-MM-dd").format(st.getDateOfBirth()),
                    st.getAddress(),
                    btn
            );
            obList.add(tm);
        }
        tblStudents.setItems(obList);
    }

    private void setStudentId() {
        if (!Database.studentTable.isEmpty()){
            Student lastStudent = Database.studentTable.get(
                    Database.studentTable.size()-1
            );
            String lastId= lastStudent.getStudentId();
            String splitData[] = lastId.split("-");
            String lastIdIntegerNumberAsAString = splitData[1];
            int lastIntegerIdAsInt=Integer.parseInt(lastIdIntegerNumberAsAString);
            lastIntegerIdAsInt++;
            String generatedStudentId="S-"+lastIntegerIdAsInt;
            txtId.setText(generatedStudentId);
        }else{
            txtId.setText("S-1");
        }
    }

    public void saveOnAction(ActionEvent actionEvent) {
        Student student = new Student(
                txtId.getText(),
                txtName.getText(),
                Date.from(txtDob.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()),
                txtAddress.getText()
        );
        Database.studentTable.add(student);
        setStudentId();
        clear();
        new Alert(Alert.AlertType.INFORMATION, "Student saved!").show();
    }

    private void clear(){
        txtDob.setValue(null);
        //txtName.setText("");
        txtName.clear();
        txtAddress.clear();
    }
}
