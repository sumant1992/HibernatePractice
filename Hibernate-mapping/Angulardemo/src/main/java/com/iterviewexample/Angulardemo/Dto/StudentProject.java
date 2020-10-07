package com.iterviewexample.Angulardemo.Dto;



public class StudentProject
{


    public String studentName;
    public String projectName;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "StudentProject{" +
                "studentName='" + studentName + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    public StudentProject(String studentName, String projectName) {
        this.studentName = studentName;
        this.projectName = projectName;
    }

    public StudentProject() {
    }
}
