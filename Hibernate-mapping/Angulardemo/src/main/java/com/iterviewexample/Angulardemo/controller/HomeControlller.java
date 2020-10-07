package com.iterviewexample.Angulardemo.controller;

import com.iterviewexample.Angulardemo.Dto.AssignProject;
import com.iterviewexample.Angulardemo.Dto.StudentProject;
import com.iterviewexample.Angulardemo.Reporisitory.ProjectRepo;
import com.iterviewexample.Angulardemo.Reporisitory.StudentRepo;
import com.iterviewexample.Angulardemo.model.Project;
import com.iterviewexample.Angulardemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class HomeControlller
{

        @Autowired
        public StudentRepo studentRepo;
        @Autowired
        public ProjectRepo projectRepo;

        @PostMapping("/add")
         public Student assignProject(@RequestBody AssignProject request)
        {
            System.out.println("1");
          return studentRepo.save(request.getStudent());
        }

        @GetMapping("/studentinfo")
        public List<Student> findAllProject(){
            return studentRepo.findAll();
        }

    @GetMapping("/join")
    public List<StudentProject> getJoinInformation(){
        return studentRepo.getJoinInformation();
    }



    @GetMapping("/")
    public List <Project> getAllProject()
    {
            return projectRepo.findAll();
    }



}
