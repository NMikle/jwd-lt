package com.epam.jwd.lt.rectangle.finals;

public class Shape {
    private final int color; // = 3;

//    {
//        color = 2; // Final fields can be initialized only once
//    }

    Shape(int color) {
        this.color = color;
    }

    final void printInfo() {
        System.out.println("Shape has color=" + color);
    }

    public static void main(String[] args) {
        Shape shape = new Shape(2);
        System.out.println(shape.color);
//        new Object();
    }
}

class Rectangle extends Shape { // we can extend class
    int height;
    int width;

    public Rectangle(int height, int width) {
        super(4);
        this.height = height;
        this.width = width;
    }

    // But can't override method
    // @Override
    // public void printInfo() {
    //     System.out.println("Rectange has height=" + height + ", width=" + width);
    // }
}
