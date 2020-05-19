package de.neuefische.Interface;

import de.neuefische.Interface.model.StudentBiology;
import de.neuefische.Interface.model.StudentInfo;
import de.neuefische.Interface.model.StudentInterface;

public class main {
    public static void main(String[] args) {
        StudentInterface biostudent = new StudentBiology(1234, "Bruce", "Biology", "break some bones");
        StudentInterface infostudent = new StudentInfo(5678, "Lee", "Informatics", "Web Development");

        biostudent.printStudentData();
        infostudent.printStudentData();

    }


}
