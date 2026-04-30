/*-------------------------------------------------------------
//grade: Teaching Assistant
//identifcation: Program.java
//SPECIFICATION: A template file for the Program class.
//FOR: CSE110 Lab 7
//-----------------------------------------------------------*/

import java.time.LocalDateTime;

public class Student {
    private double grade;
    private String firstName, lastName, identifcation, createdDate;

    public Student(String firstName, String lastName, String identifcation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifcation = identifcation;
        this.createdDate = LocalDateTime.now().toString();
        this.grade = -1;
    }

    public String toString() {
        return String.format("Student: %s, Identifcation: %s, Grade: %s",
                firstName + " " + lastName, identifcation, grade);
    }

    public String getFullName() {
        return firstName + " " +lastName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getAsuID() {
        return identifcation;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
