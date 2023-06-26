package com.example.assignTasks.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assign {
@Id

	private long id;
	private String name;
	private String username;
	private String tasks;
	private String deadline;
	private String status;
	private String comments;
	
	public Assign() {
		// TODO Auto-generated constructor stub
	}

	public Assign(long id, String name, String username, String tasks, String deadline, String status,
			String comments) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.tasks = tasks;
		this.deadline = deadline;
		this.status = status;
		this.comments = comments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTasks() {
		return tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
