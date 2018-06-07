package com.klaus.service;

import com.klaus.entity.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> selectMenuByLevel(int level);
}
