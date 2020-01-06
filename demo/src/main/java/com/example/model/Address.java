package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
       private int pincode;
       private String streatName;
       private String state;
       
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getStreatName() {
			return streatName;
		}
		public void setStreatName(String streatName) {
			this.streatName = streatName;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
       
       
}
