package com.klaus.service.Impl;

import com.klaus.dao.MenuDAO;
import com.klaus.entity.Menu;
import com.klaus.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    private MenuDAO menuDAO;

    @Override
    public List<Menu> selectMenuByLevel(int level) {
        return menuDAO.selectMenuByLevel(level);
    }
}
