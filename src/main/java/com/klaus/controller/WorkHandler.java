package com.klaus.controller;

import com.klaus.service.WorkService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class WorkHandler {

    @Autowired
    private WorkService workService;

    @RequestMapping("/work")
    public String work() {
        return "work";
    }

    @RequestMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request, HttpSession session) throws IOException {
        String fileName = "";
        if (file.getOriginalFilename().endsWith(".xls")) {
            fileName = "excel.xls";
        } else if (file.getOriginalFilename().endsWith(".xlsx")) {
            fileName = "excel.xlsx";
        } else {
            return "work";
        }
        String path = request.getServletContext().getRealPath("file");
        File newfile = new File(path, fileName);
        file.transferTo(newfile);
        InputStream inputStream = new FileInputStream(newfile);
        workService.upload(inputStream,fileName);


        return "work";
    }
}