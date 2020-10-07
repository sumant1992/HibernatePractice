package com.iterviewexample.Angulardemo.Reporisitory;

import com.iterviewexample.Angulardemo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Integer>
{



}
