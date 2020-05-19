package de.neuefische.Interface;

import de.neuefische.Interface.model.StudentBiology;
import de.neuefische.Interface.model.StudentInfo;
import de.neuefische.Interface.model.StudentInterface;

public class main {
    public static void main(String[] args) {
        StudentInterface biostudent = new StudentBiology(1234, "Bruce", "Biology", "break some bones");
        StudentInterface infostudent = new StudentInfo(5678, "Lee", "Informatics", "Web Development");

        print(biostudent);
        print(infostudent);

        gradeAverage(biostudent);
        gradeAverage(infostudent);

        //biostudent.printStudentData();
        //nfostudent.printStudentData();

    }

    public static void print(StudentInterface student) {
        student.printStudentData();
    }

    public static double gradeAverage(StudentInterface student) {
        double average = 0.0;
        double sum = 0.0;
        double[] studentGrades = student.grades();
        for(int i = 0; i < studentGrades.length; i++) {
            sum = sum + studentGrades[i];
        }
        //Calculate grade average
        average = sum / studentGrades.length;
        //Round grade average
        average = average * 100;
        average = Math.round(average);
        average = average / 100;
        //Print + return grade average
        System.out.println("Grade average: "+average);
        return average;
    }
}
