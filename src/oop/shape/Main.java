package oop.shape;

import oop.shape.figures.Circle;
import oop.shape.figures.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();

        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(5, 5);
        Shape square = new Square(9);

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        for (Shape shape : shapes) {
            System.out.println("Area of shape: " + shape.getArea());
        }
    }
}
