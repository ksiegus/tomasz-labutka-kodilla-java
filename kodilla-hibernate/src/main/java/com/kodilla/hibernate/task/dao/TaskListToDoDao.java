package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskListToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TaskListToDoDao extends CrudRepository<TaskListToDo, Integer> {

}