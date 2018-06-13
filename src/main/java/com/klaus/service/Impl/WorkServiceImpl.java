package com.klaus.service.Impl;

import com.klaus.service.WorkService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {


    @Override
    public void upload(InputStream inputStream, String fileName) throws IOException {
        Workbook workbook = null;
        if (fileName.endsWith(".xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            workbook = new XSSFWorkbook(inputStream);
        }

        Sheet sheet = workbook.getSheetAt(0);
        List workList = new ArrayList();
        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            Row row = sheet.getRow(rowNum);
            for (int cellNum = 0; cellNum < row.getLastCellNum(); cellNum++) {
                Cell cell = row.getCell(cellNum);
                CellType cellType = cell.getCellTypeEnum();
                String string = null;
                switch (cellType) {
                    case STRING:
                        string = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        string = Double.toString(cell.getNumericCellValue());
                }
                if (string == null) {
                    break;
                }
                System.out.print(string + "\t");
                workList.add(string);
            }
            System.out.print("\n");
        }
    }
}
