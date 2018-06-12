package com.klaus.service.Impl;

import com.klaus.dao.DepartmentDAO;
import com.klaus.dao.UserDAO;
import com.klaus.entity.Department;
import com.klaus.entity.Position;
import com.klaus.entity.User;
import com.klaus.service.DepartmentService;
import com.klaus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public User login(User user) {
        return userDAO.login(user);
    }

    @Override
    public List<User> selectReviewUser() {
        return userDAO.selectReviewUser();
    }

    @Override
    public List<User> changeTypeById(int id) {
        userDAO.changeTypeById(id);
        return userDAO.selectReviewUser();
    }

    @Override
    public void pushUser(User user) {
        Department department = departmentDAO.selectDepartmentByName(user.getDepartment());
        Position position = departmentDAO.selectPositionByName(user.getPosition(),department.getId());
        userDAO.pushUser(user.getName(),user.getNum(),department.getId(),user.getLevel(),user.getPassword(),user.getTel(),position.getId(),1);
    }


}
