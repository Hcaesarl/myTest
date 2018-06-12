package com.klaus.service.Impl;

import com.klaus.dao.DepartmentDAO;
import com.klaus.entity.Department;
import com.klaus.entity.Position;
import com.klaus.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public Department selectDepartmentByName(String name) {
        return departmentDAO.selectDepartmentByName(name);
    }

    @Override
    public List selectAllDepartment() {
        return departmentDAO.selectAllDepartment();
    }

    @Override
    public void addDepartment(Department department) {
        departmentDAO.addDepartment(department);
        for (Position p:department.getPosition()
             ) {
            departmentDAO.addPosition(p.getName(), department.getId(), p.getLevel());
        }
    }

    @Override
    public List selectPositionBySuperior(String depaertmentName) {
        Department department = departmentDAO.selectDepartmentByName(depaertmentName);
        return department.getPosition();
    }

    @Override
    public Position selectPositionByName(String name,int superior) {
        return departmentDAO.selectPositionByName(name,superior);
    }
}
