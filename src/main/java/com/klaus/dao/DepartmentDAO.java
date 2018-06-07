package com.klaus.dao;

import com.klaus.entity.Department;

public interface DepartmentDAO {
    public Department selectDepartmentByName(String name);
}
