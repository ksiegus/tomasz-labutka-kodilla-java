package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {
    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        assertEquals("ShoppingTask - buy [Car], quantity [2.0]", shoppingTask.executeTask());
        assertEquals("The ShoppingTask", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);

        //Then
        assertEquals("PaintingTask - color [Red], whatToPaint [Santa Claus]", paintingTask.executeTask());
        assertEquals("The PaintingTask", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);

        //Then
        assertEquals("DrivingTask - where [Warsaw], using [Bike]", drivingTask.executeTask());
        assertEquals("The DrivingTask", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
}