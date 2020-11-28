package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testGetToDoList() {
        //Given
        //When
        board.getToDoList();

        //Then
        assertEquals(3, board.getToDoList().getTasks().size());
    }

    @Test
    public void testGetInProgressList() {
        //Given
        //When
        board.getInProgressList();
        //Then
        assertEquals(3, board.getInProgressList().getTasks().size());
    }

    @Test
    public void testGetDoneList() {
        //Given

        //When
        board.getDoneList();
        //Then
        assertEquals(3, board.getDoneList().getTasks().size());

    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList toDoList = context.getBean("toDo", TaskList.class);
        TaskList inProgressList = context.getBean("inProgress", TaskList.class);
        TaskList doneList = context.getBean("done", TaskList.class);

        //When
        toDoList.addTask("Task to do 4");
        inProgressList.addTask("Task in progress 4");
        doneList.addTask("Task done 4");

        //Then
        assertEquals(4, toDoList.getTasks().size());
        assertEquals(4, inProgressList.getTasks().size());
        assertEquals(4, doneList.getTasks().size());



    }

}