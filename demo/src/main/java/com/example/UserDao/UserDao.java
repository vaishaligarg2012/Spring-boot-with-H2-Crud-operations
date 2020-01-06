package com.example.UserDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Users;
 
@Repository
public interface UserDao extends JpaRepository<Users, Integer>{
	  
}
