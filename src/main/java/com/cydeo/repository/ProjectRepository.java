package com.cydeo.repository;

import com.cydeo.entity.Project;
import com.cydeo.entity.User;
import com.cydeo.service.ProjectService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long>{

    Project findByProjectCode(String code);

    List<Project> getProjectsByAssignedManager(User manager);



}
