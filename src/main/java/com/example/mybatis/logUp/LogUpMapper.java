package com.example.mybatis.logUp;

import java.util.List;

public interface LogUpMapper {
    void createUser(LogUp user);
    List<LogUp> users();
    LogUp readOneUser(int id);
    void updateUser(LogUp user);
    void deleteUser(int id);
}
