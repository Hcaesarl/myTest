package com.klaus.service.Impl;

import com.klaus.dao.UserDAO;
import com.klaus.entity.User;
import com.klaus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

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
}
