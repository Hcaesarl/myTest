package com.klaus.controller;

import com.klaus.entity.Department;
import com.klaus.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentHandler {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("adddepartment")
    public ModelAndView adddepartment(Department department) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adddepartment");
        if (department.getName() != null) {
            System.err.println(department);
        }
        return modelAndView;
    }
}
