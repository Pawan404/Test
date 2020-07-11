package com.demo.entity;

import javax.persistence.Entity;

@Entity
public class User {
	
	static {
		System.out.println("User entity");
	}
	
	
	private Integer id;

}
