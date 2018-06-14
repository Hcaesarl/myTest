package com.klaus.service;

import com.klaus.entity.User;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

public interface WorkService {
    public void upload(InputStream inputStream, String fileName) throws IOException;

    public Set selectData(User user);
}
