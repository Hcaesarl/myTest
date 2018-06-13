package com.klaus.controller;

import com.klaus.entity.Massage;
import com.klaus.service.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class MassageHandler {

    @Autowired
    private MassageService massageService;

    @RequestMapping("/addmassage")
    public ModelAndView addmassage(Massage massage) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addmassage");
        if (massage.getText()!=null){
            massageService.addMassage(massage);
        }
        return modelAndView;
    }

    @RequestMapping("/showmassage")
    public ModelAndView showMassage(){
        ModelAndView modelAndView = new ModelAndView();
        List<Massage> massagesList = massageService.selectAllMassage();
        modelAndView.setViewName("showmassage");
        modelAndView.addObject("massageList", massagesList);
        return modelAndView;
    }
}
