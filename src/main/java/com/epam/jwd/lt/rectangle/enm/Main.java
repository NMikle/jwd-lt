package com.epam.jwd.lt.rectangle.enm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start");
        System.out.println(Color.ofHexValue("00FF00"));
        final Color blueColor = Color.of("Blue");
        System.out.println(blueColor);
        System.out.println(blueColor.ordinal());
        System.out.println("Program end");
    }

    private static void someSwitchStatement(Color color) {
        switch (color) {
            case RED:
                //some logic
                break;
            case GREEN:
                //some logic
                break;
            case BLUE:
                //some logic
                break;
            default:
                //some logic
                break;
        }
    }
}
