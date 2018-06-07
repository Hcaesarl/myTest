package com.klaus.dao;

import com.klaus.entity.Department;

import java.util.List;

public interface DepartmentDAO {
    public Department selectDepartmentByName(String name);

    public List selectAllDepartment();
}
