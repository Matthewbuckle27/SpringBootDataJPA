package com.SpringBootDataJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootDataJPA.dao.UserRepository;
import com.SpringBootDataJPA.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public List<User> readAllUser() {

		return (List<User>) userRepository.findAll();
	}

	@Transactional
	@Override
	public User findByUseridAndPassword(int userid, String password) {
		return userRepository.findByUseridAndPassword(userid, password);
	}

	@Transactional
	@Override
	public User findByUseridOrPassword(int userid, String password) {
		return userRepository.findByUseridOrPassword(userid, password);
	}
	
	@Override
    public User createUser(User user) {

          return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {

          return userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Integer userid) {

          userRepository.deleteById(userid);
          
    }

	@Override
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

	@Override
	public List<User> nativequery() {
		return userRepository.getAllUser();
	}

	@Override
	public User hqlquery(int userId) {
		return userRepository.hqlquery(userId);
	}

	@Override
	public User nalisdscd(int userId) {
	return userRepository.nalias(userId);
	}
 


}
