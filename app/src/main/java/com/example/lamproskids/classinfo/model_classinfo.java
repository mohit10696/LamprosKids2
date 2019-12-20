package com.example.lamproskids.classinfo;

public class model_classinfo {
    public String name,totalfees;

    public String getName() {
        return "Name: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalfees() {
        return "Fees: "+totalfees;
    }

    public void setTotalfees(String totalfees) {
        this.totalfees = totalfees;
    }
}
