package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isTaskExecuted = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String executeTask() {
        this.isTaskExecuted = true;
        return "DrivingTask - where [" + this.where + "], using [" + this.using + "]";
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
