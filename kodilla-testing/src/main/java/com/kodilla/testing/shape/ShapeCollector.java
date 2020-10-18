package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> shapesList = new LinkedList<>();

    public void addFigure(Shape shape) {
        this.shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesList.contains(shape)){
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int shapeNumber) {
        Shape shape = null;
        if (shapeNumber >= 0 && shapeNumber < shapesList.size()) {
            shape = shapesList.get(shapeNumber);
        }
        return shape;
    }

    public List<Shape> showFigures() {
        return shapesList;
    }

    public int getShapesQuantity(){
        return shapesList.size();
    }

}
