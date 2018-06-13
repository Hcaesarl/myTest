package com.klaus.service.Impl;

import com.klaus.dao.MassageDAO;
import com.klaus.entity.Massage;
import com.klaus.service.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MassageServiceImpl implements MassageService {

    @Autowired
    private MassageDAO massageDAO;

    @Override
    public void addMassage(Massage massage) {
        massageDAO.addmassage(massage);
    }

    @Autowired
    public List selectAllMassage() {
        return massageDAO.selectAllMassage();
    }
}
