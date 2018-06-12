package com.klaus.service;

import com.klaus.entity.Department;
import com.klaus.entity.Position;

import java.util.List;

public interface DepartmentService {
    public Department selectDepartmentByName(String name);

    public List selectAllDepartment();

    public void addDepartment(Department department);

    public List selectPositionBySuperior(String depaertmentName);

    public Position selectPositionByName(String name,int superior);
}
