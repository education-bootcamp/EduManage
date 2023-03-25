package com.developersstack.edumanage.view.tm;

import javafx.scene.control.Button;

public class TechAddTm {
    private int code;
    private String name;
    private Button btn;

    public TechAddTm() {
    }

    public TechAddTm(int code, String name, Button btn) {
        this.code = code;
        this.name = name;
        this.btn = btn;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "TechAddTm{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", btn=" + btn +
                '}';
    }
}
