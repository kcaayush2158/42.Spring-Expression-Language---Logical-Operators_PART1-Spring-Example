package com.application.model;

public class Subject {
    private String studentName;
    private Integer marksInMath;
    private Integer marksInScience;
    private Integer marksInEconomics;

    public Integer getMarksInMath() {
        return marksInMath;
    }

    public void setMarksInMath(Integer marksInMath) {
        this.marksInMath = marksInMath;
    }

    public Integer getMarksInScience() {
        return marksInScience;
    }

    public void setMarksInScience(Integer marksInScience) {
        this.marksInScience = marksInScience;
    }

    public Integer getMarksInEconomics() {
        return marksInEconomics;
    }

    public void setMarksInEconomics(Integer marksInEconomics) {
        this.marksInEconomics = marksInEconomics;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
