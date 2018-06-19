package com.klaus.dao;

import com.klaus.entity.User;
import com.klaus.entity.Work;

import java.util.List;
import java.util.Set;

public interface WorkDAO {
    public void upload(Work work);

    public int selectCount(String date,int id);
}
