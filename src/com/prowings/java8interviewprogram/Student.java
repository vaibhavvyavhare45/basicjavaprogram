package com.prowings.java8interviewprogram;

public class Student {
    int rollno;
    String  name;
    String  department;
    String gender;
    double fees;

    public Student() {
    }

    public Student(int rollno, String name, String department, String gender, double fees) {
        this.rollno = rollno;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.fees = fees;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", fees=" + fees +
                '}';
    }
}
