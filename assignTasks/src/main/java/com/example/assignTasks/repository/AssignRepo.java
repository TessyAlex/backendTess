package com.example.assignTasks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignTasks.entity.Assign;

@Repository
public interface AssignRepo extends JpaRepository<Assign, Long>{

	List<Assign> findByUsername(String username);

}
