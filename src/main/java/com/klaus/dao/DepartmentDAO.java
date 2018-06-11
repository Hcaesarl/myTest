package com.klaus.dao;

import com.klaus.entity.Department;
import com.klaus.entity.Position;

import java.util.List;

public interface DepartmentDAO {
    public Department selectDepartmentByName(String name);

    public List selectAllDepartment();

    public void addDepartment(Department department);

    public void addPosition(String name, int superior, int level);
}
