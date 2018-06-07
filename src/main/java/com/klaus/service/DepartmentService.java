package com.klaus.service;

import com.klaus.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department selectDepartmentByName(String name);

    public List selectAllDepartment();
}
