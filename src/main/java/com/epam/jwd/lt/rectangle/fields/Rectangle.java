package com.epam.jwd.lt.rectangle.fields;

public class Rectangle {
    int height;
    int width;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.height + " " + rectangle.width);
        rectangle.height = 3;
        rectangle.width = 4;
        System.out.println("Rectangle area = " + (rectangle.width * rectangle.height));
    }
}
