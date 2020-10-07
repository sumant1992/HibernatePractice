package com.iterviewexample.Angulardemo.Reporisitory;

import com.iterviewexample.Angulardemo.Dto.StudentProject;
import com.iterviewexample.Angulardemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer>
{
    @Query("SELECT new com.iterviewexample.Angulardemo.Dto.StudentProject(c.studentname, p.projectname) FROM Student c JOIN c.projects p")
    public List<StudentProject> getJoinInformation();


}
