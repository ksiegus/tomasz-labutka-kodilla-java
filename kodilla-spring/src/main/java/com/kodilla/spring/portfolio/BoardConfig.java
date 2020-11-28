package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }


    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        TaskList toDoList = new TaskList();
        toDoList.addTask("Task to do 1");
        toDoList.addTask("Task to do 2");
        toDoList.addTask("Task to do 3");
        return toDoList;
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        TaskList inProgressList = new TaskList();
        inProgressList.addTask("Task in progress 1");
        inProgressList.addTask("Task in progress 2");
        inProgressList.addTask("Task in progress 3");
        return inProgressList;
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        TaskList doneList = new TaskList();
        doneList.addTask("Task done 1");
        doneList.addTask("Task done 2");
        doneList.addTask("Task done 3");
        return doneList;
    }

}