package com.iterviewexample.Angulardemo.Dto;


import com.iterviewexample.Angulardemo.model.Student;



public class AssignProject
{
    public Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "AssignProject{" +
                "student=" + student +
                '}';
    }

    public AssignProject(Student student) {
        this.student = student;
    }

    public AssignProject() {
    }
}
