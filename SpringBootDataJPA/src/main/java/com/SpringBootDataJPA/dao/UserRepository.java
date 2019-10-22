package com.SpringBootDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SpringBootDataJPA.model.User;

@Repository

public interface UserRepository extends CrudRepository<User, Integer>{
public User findByUseridAndPassword(int userid,String password);
public User findByUseridOrPassword(int userid,String password);

@Query("select user from User user")
public List<User> getAllUser();

@Query(value="select * from usertable",nativeQuery=true)
public List<User> nativequery();

@Query(value="select * from usertable where userid =:mathew",nativeQuery=true)
public User hqlquery(@Param("mathew") int id);

@Query("select user from User user where user.userid = ?1")
public User nalias(int userId);

}


