package com.klaus.dao;

import com.klaus.entity.Massage;

import java.util.List;

public interface MassageDAO {
    public void addmassage(Massage massage);

    public List selectAllMassage();
}
