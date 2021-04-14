package com.epam.jwd.lt.rectangle.methods;

public class Rectangle {
    int height;
    int width;

    int getArea() {
        return height * width;
    }

    int getVolume(int depth, boolean log) {
        int volume = depth * height * width;
        if (log) {
            System.out.println("Counted volume for depth: " + depth + ", height: " + height + ", width: "
                    + width + ". Volume: " + volume);
        }
        return volume;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 3;
        rectangle.width = 4;
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Volume of a rectangle with depth 5 = " + rectangle.getVolume(5, true));
        System.out.println("Volume of a rectangle with depth 5 = " + rectangle.getVolume(6, false));
    }

}
