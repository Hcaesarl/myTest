package com.klaus.dao;

import com.klaus.entity.Menu;
import com.klaus.entity.User;

import java.util.List;

public interface UserDAO {
    public User login(User user);

    public String selectDPById(int id);

    public List<Menu> selecMenu(int id);

    public List selectUserByDepartment(int departmentId);

    public List<User> selectReviewUser();

    public void  changeTypeById(int id);

    public User selectUserById(int id);

    public void pushUser(String name,int num,int department_id,int level,String password,int tel,int position_id,int type);

    public User selecyUserByNameAndNum(String name, int num);
}
