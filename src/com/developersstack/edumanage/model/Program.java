package com.developersstack.edumanage.model;

import java.util.Arrays;

public class Program {
    private String code;
    private String name;
    private String[] technologies;
    private String teacherId;
    private double cost;

    public Program() {
    }

    public Program(String code, String name, String[] technologies, String teacherId, double cost) {
        this.code = code;
        this.name = name;
        this.technologies = technologies;
        this.teacherId = teacherId;
        this.cost = cost;
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

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Program{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                ", teacherId='" + teacherId + '\'' +
                ", cost=" + cost +
                '}';
    }
}
