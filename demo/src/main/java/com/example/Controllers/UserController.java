package com.example.Controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserDao.UserDao;
import com.example.UserDaoImpl.UserDaoImpl;
import com.example.model.Users;

@RestController
public class UserController {

	 @Autowired
	 private UserDaoImpl userDaoImpl;
	  
	 @Autowired
	 private UserDao userDao;
	 
	  @PostMapping("/adduser")
	  public Users  addUser(@Valid @RequestBody Users user) {
		  System.out.println("I am here"+user.getName());
	      return   userDaoImpl.createUser(user);
	  }
	  
	  @GetMapping("/getAllUsers")
	  public List<Users> getAllUsers() {
		  return userDao.findAll();
	  }
	  
	  @GetMapping("/getUserById/{id}")
	  public Optional<Users> getAllUsers(@PathVariable int id) {
		  return userDao.findById(id);
	  }
}
