package com.klaus.service;

import com.klaus.entity.Massage;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MassageService {
    public void addMassage(Massage massage);

    public List selectAllMassage();
}
