package com.klaus.service.Impl;

import com.klaus.dao.ProjectDAO;
import com.klaus.entity.Project;
import com.klaus.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    private ProjectDAO projectDAO;

    @Override
    public void pushProject(Project project) {
        projectDAO.pushProject(project);
    }
}
