package com.practice1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice1.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
