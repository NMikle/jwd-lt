package com.epam.jwd.lt.rectangle.override;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int height, int width, int color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void printInfo() {
//        super.printInfo(); //optional
        System.out.println("Rectangle has height=" + height + ", width=" + width);
    }

    public static void main(String[] args) {
        Shape shape = new Shape(1);
        shape.printInfo();

        Rectangle rectangle = new Rectangle(3, 4, 2);
        rectangle.printInfo();

        Shape s = new Rectangle(3, 4, 2);
        s.printInfo(); // child method called despite the reference type
    }
}

class Shape {

    int color;

    Shape(int color) {
        this.color = color;
    }

    void printInfo() {
        System.out.println("Shape has color=" + color);
    }
}
