package com.klaus.service;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;

public interface WorkService {
    public void upload(InputStream inputStream, String fileName) throws IOException;
}
