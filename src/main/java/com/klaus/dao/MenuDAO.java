package com.klaus.dao;

import com.klaus.entity.Menu;

import java.util.List;

public interface MenuDAO {
    public List<Menu> selectMenuByLevel(int level);
}
