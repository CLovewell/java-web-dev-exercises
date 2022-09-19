package org.launchcode.java.demos.lsn3classes1.school;

import org.launchcode.java.demos.lsn3classes1.Student;
import java.util.ArrayList;

public class Course {
    private int courseNumber;
    private String department;
    private String title;
    private int credits;
    private ArrayList<Student> roster;
    private Teacher instructor;

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    private void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setCredits(int credits) {
        this.credits = credits;
    }

    void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    private void enroll(Student s) {
        this.roster.add(s);
    }
}
