package org.example.activity124;

// 2.2) Create class Students extend Person class

public class Students extends Person {

    // 2.2.1) Create attribute schoolName

    private String schoolName;

    // 2.2.2) Create getters and setters for attribute

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    // 2.2.4) Override method introduce of person →> "I am study in university < schoolName>"

    public void introduce() {
        System.out.println("I study in university " + schoolName);
    }
}
