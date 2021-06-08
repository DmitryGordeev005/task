package com.rest.Lab_Rest.controller;

import com.rest.Lab_Rest.model.Task;
import com.rest.Lab_Rest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("")
    public List<Task> list() {
        return taskService.listAllTask();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> get(@PathVariable Integer idtask) {
        try {
            Task task = taskService.getTask(idtask);
            return new ResponseEntity<Task>(task, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
        }
    }

}
