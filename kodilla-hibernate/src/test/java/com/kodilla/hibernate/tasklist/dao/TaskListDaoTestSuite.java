package com.kodilla.hibernate.tasklist.dao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList("TODO", "List description.");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        //taskListDao.deleteById(id);
    }

    @Test
    void testFindByListName() {
        //Given

        //When
        List<TaskList> taskLists = taskListDao.findByListName("TODO");

        //Then
        int result = taskLists.size();
        assertEquals(1, result);

        //CleanUp
        for(TaskList taskList:taskLists) {
            taskListDao.deleteById(taskList.getId());
        }

    }
}
