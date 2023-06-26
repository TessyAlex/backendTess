package com.example.assignTasks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignTasks.entity.Assign;
import com.example.assignTasks.repository.AssignRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController	
@RequestMapping("/assign")
public class AssignController {

	@Autowired
	AssignRepo assignrepo;
	
	
	@GetMapping("/retrieve/{username}")
    public String retrieveById(@PathVariable String username)
    {
        String name = "";
        List<Assign> assigns = assignrepo.findByUsername(username);
        if (!assigns.isEmpty())
        {
            Assign view = assigns.get(0);
            name = view.getName();
        }
        return name;
    }
	@PostMapping("/create")
	
	public ResponseEntity<Assign> create(@RequestBody Assign assign){
		return ResponseEntity.ok().body(assignrepo.save(assign));
}
}
