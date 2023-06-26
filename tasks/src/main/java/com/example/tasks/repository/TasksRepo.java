package com.example.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tasks.entity.Tasks;

@Repository
public interface TasksRepo extends JpaRepository<Tasks, Long> {

}
