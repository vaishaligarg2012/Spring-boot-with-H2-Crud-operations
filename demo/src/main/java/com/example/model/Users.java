package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usersFromInfogain")
public class Users {
    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    @Column(name="phone")
	    private int phoneNumber;
	  //  private Address address;
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
//		@OneToMany
//		public Address getAddress() {
//			return address;
//		}
//		public void setAddress(Address address) {
//			this.address = address;
//		}
	    
}
