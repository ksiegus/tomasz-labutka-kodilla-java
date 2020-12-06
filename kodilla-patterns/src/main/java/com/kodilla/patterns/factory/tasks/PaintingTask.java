package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isTaskExecuted = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public String executeTask() {
        this.isTaskExecuted = true;
        return "PaintingTask - color [" + this.color + "], whatToPaint [" + this.whatToPaint + "]";
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
