package com.klaus.controller;

import com.klaus.entity.Department;
import com.klaus.entity.Menu;
import com.klaus.entity.Position;
import com.klaus.entity.User;
import com.klaus.service.DepartmentService;
import com.klaus.service.MenuService;
import com.klaus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
//@SessionAttributes({"user","list"})
public class UserHandler {

    @Autowired
    private UserService userService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/login")
    public ModelAndView login(User user,HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        User loginUser = userService.login(user);
        List<Menu> list = menuService.selectMenuByLevel(loginUser.getLevel());
        Department department=departmentService.selectDepartmentByName(loginUser.getDepartment());
        System.out.println(department);
        if (loginUser != null) {
            session.setAttribute("user",loginUser);
            session.setAttribute("list", list);
            modelAndView.addObject("user", loginUser);
            modelAndView.addObject("list", list);
            modelAndView.addObject("department", department);
            modelAndView.setViewName("index");
        }else {
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }

    @RequestMapping("/reviewuser")
    public ModelAndView reviewUser(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> reviewUserList=userService.selectReviewUser();
        modelAndView.setViewName("reviewuser");
        modelAndView.addObject("reviewUserList", reviewUserList);
        return modelAndView;
    }

    @RequestMapping("/changetype")
    public ModelAndView changetype(User user){
        ModelAndView modelAndView = new ModelAndView();
        List<User> reviewUserList=userService.changeTypeById(user.getId());
        modelAndView.setViewName("reviewuser");
        modelAndView.addObject("reviewUserList", reviewUserList);
        return modelAndView;
    }

    @RequestMapping("/adduser")
    public ModelAndView addUser(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adduser");
        User sessionUser = (User) session.getAttribute("user");
        System.out.println(sessionUser);
        List positionList = departmentService.selectPositionBySuperior(sessionUser.getDepartment());
        modelAndView.addObject("positionList", positionList);
        return modelAndView;
    }

    @RequestMapping("/pushuser")
    public String pushuser(User user) {
        userService.pushUser(user);
        return "/adduser";
    }
}
