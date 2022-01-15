package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {

    @Id
    private Integer EmployeeID;
    private String EmployeeName;
    private boolean EmployeeParticipation;
    private String Feedback;

    // Empty Constructor
    public Data() {
    }

    // Parameters Constructor
    public Data(Integer employeeID, String employeeName, boolean employeeParticipation, String feedback) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
        EmployeeParticipation = employeeParticipation;
        Feedback = feedback;
    }

    // Getters & Setters
    public Integer getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public boolean isEmployeeParticipation() {
        return EmployeeParticipation;
    }

    public void setEmployeeParticipation(boolean employeeParticipation) {
        EmployeeParticipation = employeeParticipation;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }
}
