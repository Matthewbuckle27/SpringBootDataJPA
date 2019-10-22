package com.SpringBootDataJPA.service;

import java.util.List;

import com.SpringBootDataJPA.model.User;

public interface UserService {
    public List<User> readAllUser();
    public User findByUseridAndPassword(int userid,String password);
    public User findByUseridOrPassword(int userid,String password);
    public void deleteUser(Integer userid);
    public User updateUser(User user);
    public User createUser(User user);
    public List<User> getAllUser();
    public List<User> nativequery();
    public User hqlquery(int userId);
    public User nalisdscd(int userId);
    
}



