package com.example.UserDaoImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.UserDao.UserDao;
import com.example.model.Users;

@Service
public class UserDaoImpl {

	
	@Autowired
    public UserDao userDao;
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
	  
	   Users v = userDao.save(user);
	   System.out.println(v); 
           return v;
	}

	
	
}
