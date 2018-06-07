package com.klaus.controller;

import com.klaus.entity.Department;
import com.klaus.entity.Project;
import com.klaus.service.DepartmentService;
import com.klaus.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@SessionAttributes("departmentList")
@Controller
public class ProjectHandler {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private ProjectService projectService;


    @RequestMapping("/addproject")
    public ModelAndView addProject() {
        ModelAndView modelAndView = new ModelAndView();
        List<Department> departmentList = departmentService.selectAllDepartment();
        modelAndView.addObject("departmentList", departmentList);
        modelAndView.setViewName("addproject");
        return modelAndView;
    }

    @RequestMapping("/pushproject")
    public ModelAndView pushProject(Project project) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addproject");
        projectService.pushProject(project);
        return modelAndView;
    }
}
