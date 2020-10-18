package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    class TestSquare {
        @Test
        void testAddSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveSquareNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(10);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testSquareField() {
            //Given
            Square square = new Square(10);

            //When
            double result = square.getField();

            //Then
            Assertions.assertEquals(100, result);
        }

    }

    @Nested
    class TestTriangle {
        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10, 20);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10, 20);
            shapeCollector.addFigure(triangle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveTriangleNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(10, 20);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testTriangleField() {
            //Given
            Triangle triangle = new Triangle(10, 20);

            //When
            double result = triangle.getField();

            //Then
            Assertions.assertEquals(100, result);
        }

    }

    @Nested
    class TestCircle {
        @Test
        void testAddCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10);
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveCircleNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testCircleField() {
            //Given
            Circle circle = new Circle(10);

            //When
            double result = circle.getField();
            double expectedResult = Math.PI*100;
            //Then
            Assertions.assertEquals(expectedResult, result);
        }
    }

}

