package com.iterviewexample.Angulardemo.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "student")
public class Student
{
    @Id
    @GeneratedValue
    public int id;

    public  String studentname;


    @OneToMany(targetEntity = Project.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "p_fk",referencedColumnName = "id")
    public List<Project> projects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return studentname;
    }

    public void setName(String name) {
        this.studentname = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Student(int id, String name, List<Project> projects) {
        this.id = id;
        this.studentname = name;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + studentname + '\'' +
                ", projects=" + projects +
                '}';
    }


    public Student() {
    }
}
