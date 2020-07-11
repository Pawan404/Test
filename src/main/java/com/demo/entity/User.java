package com.demo.entity;

import javax.persistence.Entity;

@Entity
public class User {
	
	static {
		System.out.println("User entity 111 0000");
		System.out.println("User entity 222");
	}
	
	
	private Integer id;

}
