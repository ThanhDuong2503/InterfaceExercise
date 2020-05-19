package de.neuefische.Interface.model;

public class StudentInfo implements StudentInterface {

    private int id;
    private String name;
    private String subject;
    private String coding;


    public StudentInfo(int id, String name, String subject, String coding) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.coding = coding;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }


    @Override
    public void printStudentData() {
        System.out.println("ID: " + id + " Name: " + name + " Subject: " + subject + " Coding: " + coding);
    }

    @Override
    public double[] grades() {
        double[] allGrades = new double[3];
        allGrades[0] = 2.0;
        allGrades[1] = 3.0;
        allGrades[2] = 4.0;
        return allGrades;
    }
}
