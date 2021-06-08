package com.rest.Lab_Rest.repository;

import com.rest.Lab_Rest.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class TaskRepositoryTests {

    @Autowired
    private TaskRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateTask() {
        Task task = new Task();

        task.setName("Name");
        task.setInformation("Some info");

        Task savedTask = repo.save(task);

        Task existTask = entityManager.find(Task.class, savedTask.getIdtask());
        assertEquals(existTask.getName(), savedTask.getName());
    }
}