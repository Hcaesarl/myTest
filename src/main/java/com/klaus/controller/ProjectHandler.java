package com.klaus.controller;

import com.klaus.entity.Department;
import com.klaus.service.DepartmentService;
import com.klaus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProjectHandler {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/addproject")
    public ModelAndView addProject() {
        ModelAndView modelAndView = new ModelAndView();
        List<Department> departmentList = departmentService.selectAllDepartment();
        modelAndView.addObject("departmentList", departmentList);
        modelAndView.setViewName("addproject");
        return modelAndView;
    }

    @RequestMapping("/pushproject")
    public ModelAndView pushProject() {
        ModelAndView modelAndView = new ModelAndView();
        List<Department> departmentList = departmentService.selectAllDepartment();
        modelAndView.addObject("departmentList", departmentList);
        modelAndView.setViewName("addproject");
        return modelAndView;
    }
}
