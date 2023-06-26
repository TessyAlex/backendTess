package com.example.tasks.entity;

public class TaskRequest {
	  
	  private String[] tasks;
	  
	  private String username;
	  
	  // Getters and setters

	  public String[] getTasks() {
	    return tasks;
	  }

	  public void setTasks(String[] tasks) {
	    this.tasks = tasks;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }
	}
