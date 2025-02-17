package com.azhar.exp;

public class InternshipEmployee extends Employee {
    
    private int length;

    public InternshipEmployee(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + length + " months/s\n";
        return info;
    }

}
