package com.klaus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class WorkHandler {
    @RequestMapping("/work")
    public String work() {
        return "work";
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file) {
        System.out.println(file.getOriginalFilename());
        return "work";
    }
}