package com.epam.jwd.lt.rectangle.constructors;

public class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    Rectangle(int height) {
        this(height, height);
    }

    public int getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Rectangle area = " + rectangle.getArea());
        Rectangle square = new Rectangle(5);
        System.out.println("Square area = " + square.getArea());
    }
}
