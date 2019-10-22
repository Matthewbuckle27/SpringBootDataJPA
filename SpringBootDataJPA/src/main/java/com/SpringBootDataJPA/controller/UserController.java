package com.SpringBootDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDataJPA.model.User;
import com.SpringBootDataJPA.service.UserService;

@RestController
public class UserController {
      @Autowired
      private UserService userService;
      @RequestMapping(value="/read")
      public List<User> getAllUsers(){
            return  userService.readAllUser();
      }
      
      @RequestMapping(value="/get")
      public List<User> getAll(){
            return  userService.getAllUser();
      }
      
      @RequestMapping(value="/getn")
      public List<User> getAllNative(){
            return  userService.nativequery();
      }
      
      @RequestMapping(value="/getone/{id}")
      public User getOneUser(@PathVariable("id") int userId){
            return  userService.hqlquery(userId);
      }
      
      @RequestMapping(value="/getonea/{id}")
      public User getOneUserAlias(@PathVariable("id") int userId){
            return  userService.nalisdscd(userId);
      }
            
      @GetMapping(value = "/findUserByAnd/{id}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
      public User getUserByAnd(@PathVariable("id") int id,@PathVariable("password") String password) {
          return userService.findByUseridAndPassword(id,password);
      }
      @GetMapping(value = "/findUserByOr/{id}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
      public User getUserByOr(@PathVariable("id") int id,@PathVariable("password") String password) {
          return userService.findByUseridOrPassword(id,password);
      }
      
      @PostMapping(value="/create", headers="Accept=application/json")
      public User createUser(@RequestBody User user){
            return userService.createUser(user);
      }
      @PutMapping(value="/update", headers="Accept=application/json")
      public User updateUser(@RequestBody User user){
            return userService.updateUser(user);
      }
      @DeleteMapping(value="/delete/{id}")
      public void deleteUser(@PathVariable("id") Integer id){
            userService.deleteUser(id);
      }
   
      
}

