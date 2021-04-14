package com.epam.jwd.lt.rectangle.ref;

public class Rectangle {

    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle firstRef = new Rectangle(3, 4);
        Rectangle secondRef = firstRef;
        changeRectangle(firstRef);
        System.out.println("First rectangle: height = " + firstRef.height + ", width = " + firstRef.width);
        System.out.println("Second rectangle: height = " + secondRef.height + ", width = " + secondRef.width);
    }

    static void changeRectangle(Rectangle rectangle) {
        rectangle.height += 2; // rectangle.height = rectangle.height + 2;
        rectangle = new Rectangle(6, 7);
    }
}
