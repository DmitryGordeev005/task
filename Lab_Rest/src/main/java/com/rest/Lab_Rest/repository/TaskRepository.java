package com.rest.Lab_Rest.repository;

import com.rest.Lab_Rest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
