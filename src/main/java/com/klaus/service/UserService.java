package com.klaus.service;

import com.klaus.entity.User;

import java.util.List;

public interface UserService {
    public User login(User user);
    public List<User> selectReviewUser();
    public List<User> changeTypeById(int id);
    public void pushUser(User user);
}
