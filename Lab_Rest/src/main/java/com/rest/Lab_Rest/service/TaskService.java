package com.rest.Lab_Rest.service;

import com.rest.Lab_Rest.model.Task;
import com.rest.Lab_Rest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> listAllTask() {
        return taskRepository.findAll();
    }

    public Task getTask(Integer idtask) {
        return taskRepository.findById(idtask).get();
    }

}
