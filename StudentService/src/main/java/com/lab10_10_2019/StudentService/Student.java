package com.lab10_10_2019.StudentService;

public class Student {

    private int studentID = 60070028;
    private String fname = "Tinnapat";
    private String lname = "Plangesri";

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
