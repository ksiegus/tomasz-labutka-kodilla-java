package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isTaskExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String executeTask() {
        this.isTaskExecuted = true;
        return "ShoppingTask - buy [" + this.whatToBuy + "], quantity [" + this.quantity + "]";
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
