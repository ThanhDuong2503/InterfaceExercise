package de.neuefische.Interface.model;

public class StudentBiology implements StudentInterface {

    private int id;
    private String name;
    private String subject;
    private String experiment;



    public StudentBiology(int id, String name, String subject, String experiment) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.experiment = experiment;

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

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }



    @Override
    public void printStudentData() {
        System.out.println("ID: " + id + " Name: " + name + " Subject: " + subject + " Experiment: " + experiment);
    }

    @Override
    public double[] grades() {
        double[] allGrades = new double[3];
        allGrades[0] = 1.0;
        allGrades[1] = 2.0;
        allGrades[2] = 3.0;
        return allGrades;
    }
}
