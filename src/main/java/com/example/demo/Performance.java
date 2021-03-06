package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Performance {

    @Id
    Integer ID;
    String Performance;

    // Empty Constructor
    public Performance() {
    }

    // Parameters Constructor
    public Performance(Integer ID, String performance) {
        this.ID = ID;
        Performance = performance;
    }

    // Getters & Setters
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPerformance() {
        return Performance;
    }

    public void setPerformance(String performance) {
        Performance = performance;
    }
}
