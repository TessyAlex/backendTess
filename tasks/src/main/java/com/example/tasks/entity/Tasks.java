package com.example.tasks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tasks {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String tasks;
	public Tasks() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Tasks( String username, String tasks) {
		super();
		
		this.username = username;
		this.tasks = tasks;
	}


	public void setTasks(String tasks) {
		this.tasks = tasks;
	}
	

	public String getTasks() {
		return tasks;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
