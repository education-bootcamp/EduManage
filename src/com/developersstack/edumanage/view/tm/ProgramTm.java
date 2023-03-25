package com.developersstack.edumanage.view.tm;

import javafx.scene.control.Button;

public class ProgramTm {
    private String code;
    private String name;
    private String teacher;
    private Button btnTech;
    private double cost;
    private Button btn;

    public ProgramTm() {
    }

    public ProgramTm(String code, String name, String teacher, Button btnTech, double cost, Button btn) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.btnTech = btnTech;
        this.cost = cost;
        this.btn = btn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Button getBtnTech() {
        return btnTech;
    }

    public void setBtnTech(Button btnTech) {
        this.btnTech = btnTech;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
