package com.developersstack.edumanage.view.tm;

import javafx.scene.control.Button;

public class TeacherTm {
    private String code;
    private String name;
    private String address;
    private String contact;
    private Button btn;

    public TeacherTm() {
    }

    public TeacherTm(String code, String name, String address, String contact, Button btn) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.setBtn(btn);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
