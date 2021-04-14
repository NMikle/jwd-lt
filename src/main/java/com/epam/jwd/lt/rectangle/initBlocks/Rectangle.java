package com.epam.jwd.lt.rectangle.initBlocks;

public class Rectangle {
    int height;
    int width;

    {
        System.out.println(1);
        System.out.println("Initialization block");
        System.out.println("Current field values: height=" + height + ", width=" + width);
    }

    public Rectangle(int height, int width) {
        System.out.println(3);
        System.out.println("In constructor");
        this.height = height;
        this.width = width;
    }

    {
        System.out.println(2);
        System.out.println("Another Initialization block");
    }

    int getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        System.out.println("Program start");
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area: " + rectangle.getArea());
        Rectangle anotherRectangle = new Rectangle(5, 6);
        System.out.println("Area: " + anotherRectangle.getArea());
    }
}
