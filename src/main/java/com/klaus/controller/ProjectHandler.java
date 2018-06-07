package com.klaus.controller;

import com.klaus.service.DepartmentService;
import com.klaus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ProjectHandler {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/addproject")
    public ModelAndView addProject() {
        return null;
    }
}
