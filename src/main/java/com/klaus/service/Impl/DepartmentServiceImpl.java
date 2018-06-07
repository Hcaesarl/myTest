package com.klaus.service.Impl;

import com.klaus.dao.DepartmentDAO;
import com.klaus.entity.Department;
import com.klaus.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public Department selectDepartmentByName(String name) {
        return departmentDAO.selectDepartmentByName(name);
    }
}
