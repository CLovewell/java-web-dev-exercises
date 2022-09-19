package org.launchcode.java.demos.lsn3classes1.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
