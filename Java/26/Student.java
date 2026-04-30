/*-------------------------------------------------------------
// AUTHOR: Seth Huffman swhuffma
// FILENAME: Student.java
// FOR: CSE110 Lab 8
//-----------------------------------------------------------*/


public class Student {
    private double grade;
    private String fullname, identifcation;
    private int accessed, update;


    public Student() {
        this.fullname = fullname;
        this.identifcation = identifcation;
        this.grade = -1;
        this.update = 0;
        this.accessed = 0;
    }

    public Student(String fullname, String identifcation, double grade) {
        this.fullname = fullname;
        this.identifcation = identifcation;
        this.grade = grade;
        this.update = 0;
        this.accessed = 0;
    }

    public String toString() {
        return String.format("Student: %s, ASUID: %s, Grade: %s", fullname, identifcation, grade);
    }

    public String getFullname() {
        this.accessed++;
        return fullname;
    }

    public String getAsuID() {
        this.accessed++;
        return identifcation;
    }

    public double getGrade() {
        this.update++;
        return grade;
    }
    public void setGrade(double grade) {
        this.accessed++;
        this.grade = grade;
    }

    public void setName(String fullname) {
        this.update++;
        this.fullname = fullname;
    }

    public void setId(String identifcation) {
        this.update++;
        this.identifcation = identifcation;
    }

    public boolean equals(Student other) {
        if(this.identifcation == other.identifcation) {
            return true; 
        } else if (this.fullname.equalsIgnoreCase(other.fullname)) {
            return true ;
        } else {
            return false;
        }
    }

    public int getNumOfUpdates() {
        this.accessed++;
        return update;
    }

    public int getNumOfAccessed() {
        this.accessed++;
        return accessed;
    }
}