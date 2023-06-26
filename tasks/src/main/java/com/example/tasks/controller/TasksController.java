package com.example.tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasks.entity.TaskRequest;
import com.example.tasks.entity.Tasks;
import com.example.tasks.repository.TasksRepo;

@RequestMapping("/tasks")
@RestController
@CrossOrigin
public class TasksController {

	@Autowired
	TasksRepo tasksrepo;
	
	@PostMapping("/get")
	  public ResponseEntity<String> submitTasks(@RequestBody TaskRequest tasks1) {
		try {
		 String username = tasks1.getUsername();
	      String[] tasks = tasks1.getTasks();
	      for (String task : tasks) {
	        Tasks newTask = new Tasks(task, username);
	        tasksrepo.save(newTask);
	      }
	      return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	   
	      } catch (Exception e) {
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while submitting tasks");
	    }
		
	  }
	
}
