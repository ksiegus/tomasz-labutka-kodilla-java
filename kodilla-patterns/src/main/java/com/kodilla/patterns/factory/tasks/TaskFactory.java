package com.kodilla.patterns.factory.tasks;


public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("The ShoppingTask", "Car", 2.0);
            case PAINTING:
                return new PaintingTask("The PaintingTask", "Red", "Santa Claus");
            case DRIVING:
                return new DrivingTask("The DrivingTask", "Warsaw", "Bike");
            default:
                return null;
        }
    }
}
