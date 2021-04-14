package com.epam.jwd.lt.rectangle.inheritance;

import java.util.Objects;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void printColor() { //you can widen protected to public
        System.out.println("No color for rectangle");
    }

    public void printInfo() {
        System.out.println("Rectange has height=" + height + ", width=" + width);
        printColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (height != rectangle.height) return false;
        return width == rectangle.width;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.color = 1;

        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.color = 2;

        rectangle.printInfo();
//        shape.printColor(); // does not compile outside of Rectangle

        System.out.println("--------------------------");
        Shape childReference = new Square(5);
//        childReference.printColor();
        ShapeService.printShapeInfo(new Rectangle(5, 4));
//        Rectangle viceVersa = new Shape(); //does not compile because shape is not always Rectangle
        System.out.println(childReference);
        final Shape shapeForEq = new Shape();
        //a.equals(a) always true
        //a.equals(b) => b.equals(a) always true
        //a.equals(b), b.equals(c) => a.equals(c) always true
    }
}

class Shape {

    int color;

    protected void printColor() {
        System.out.println("Shape has color=" + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return color == shape.color;
    }

    @Override
    public int hashCode() {
        return color;
    }
}

class Square extends Rectangle {

    public Square(int height) {
        super(height, height);
    }

    @Override
    public void printColor() { //need to because of Rectangle
        System.out.println("square color");
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                ", color=" + color +
                '}';
    }
}
