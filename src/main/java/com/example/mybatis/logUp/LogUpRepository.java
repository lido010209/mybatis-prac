package com.example.mybatis.logUp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LogUpRepository {
    private final SqlSessionFactory sessionFactory;
    public LogUpRepository(SqlSessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createUser(LogUp user){
        try (SqlSession session= sessionFactory.openSession()){
            LogUpMapper mapper = session.getMapper(LogUpMapper.class);
            mapper.createUser(user);
        }
    }

    public List<LogUp> users(){
        try (SqlSession session= sessionFactory.openSession()){
            LogUpMapper mapper = session.getMapper(LogUpMapper.class);
            return mapper.users();
        }
    }

    public LogUp readOneUser(int id){
        try (SqlSession session= sessionFactory.openSession()){
            LogUpMapper mapper = session.getMapper(LogUpMapper.class);
            return mapper.readOneUser(id);
        }
    }

    public void updateUser(LogUp user){
        try (SqlSession session= sessionFactory.openSession()){
            LogUpMapper mapper = session.getMapper(LogUpMapper.class);
            mapper.updateUser(user);
        }
    }

    public void deleteUser(int id){
        try (SqlSession session= sessionFactory.openSession()){
            LogUpMapper mapper = session.getMapper(LogUpMapper.class);
            mapper.deleteUser(id);
        }
    }
}
