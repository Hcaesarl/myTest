package com.klaus.service.Impl;

import com.klaus.dao.UserDAO;
import com.klaus.dao.WorkDAO;
import com.klaus.entity.User;
import com.klaus.entity.Work;
import com.klaus.service.WorkService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkDAO workDAO;

    @Autowired
    private UserDAO userDAO;


    @Override
    public void upload(InputStream inputStream, String fileName) throws IOException {
        Workbook workbook = null;
        if (fileName.endsWith(".xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            workbook = new XSSFWorkbook(inputStream);
        }

        Sheet sheet = workbook.getSheetAt(0);
//        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {

        int rowNum = 1;
        while (sheet.getRow(rowNum) != null && !("".equals(sheet.getRow(rowNum).getCell(0).getStringCellValue()))) {
            Row row = sheet.getRow(rowNum);
            List workList = new ArrayList();


            for (int cellNum = 0; cellNum < row.getLastCellNum(); cellNum++) {
                Cell cell = row.getCell(cellNum);
                CellType cellType = cell.getCellTypeEnum();
                String string = "";
                switch (cellType) {
                    case STRING:
                        string = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        string = Double.toString(cell.getNumericCellValue());
                }
//                System.out.print(string + "\t");
                workList.add(string);
            }

//            System.err.println(workList);
            toWork(workList);
//            System.out.print("\n");
            rowNum++;

        }

        }

    @Override
    public List selectData(User user) {
        Date date=new Date(); //取时间
        Calendar calendar = new GregorianCalendar();
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(ft.format(date));
            int count=workDAO.selectCount(ft.format(date).toString(), user.getId());
            list.add(count);
            calendar.setTime(date);
            calendar.add(calendar.DATE,-1); //把日期往后增加一天,整数  往后推,负数往前移动
            date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        }
        return list;

    }


    public void toWork(List workList) {
        String name = (String) workList.get(25);
        String num_str = (String) workList.get(26);
        String int_str = num_str.substring(0, 5);
        int num = Integer.parseInt(int_str);
        User user = userDAO.selecyUserByNameAndNum(name, num);
        Work work = new Work(0,(String) workList.get(0), (String) workList.get(1), (String) workList.get(2), (String) workList.get(3), (String) workList.get(4), (String) workList.get(5), (String) workList.get(6), (String) workList.get(7), (String) workList.get(8), (String) workList.get(9), (String) workList.get(10), (String) workList.get(11), (String) workList.get(12), (String) workList.get(13), (String) workList.get(14), (String) workList.get(15), (String) workList.get(16), (String) workList.get(17), (String) workList.get(18), (String) workList.get(19), (String) workList.get(20), (String) workList.get(21), (String) workList.get(22), (String) workList.get(23), (String) workList.get(24), user, (String) workList.get(27),(String)workList.get(28));
//        System.out.println(work);
        workDAO.upload(work);
    }
}
