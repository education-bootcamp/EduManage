package com.developersstack.edumanage.model;

import java.util.Date;

public class Student {
    private String studentId;
    private String fullName;
    private Date dateOfBirth;
    private String address;

    public Student() {
    }

    public Student(String studentId, String fullName, Date dateOfBirth, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
