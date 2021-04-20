package com.epam.jwd.lt.rectangle.enm;

public enum Color {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");

    private final String rgbValue;

    Color(String rgbValue) {
        System.out.println("inside constructor " + name());
        this.rgbValue = rgbValue;
    }

    public String getRgbValue() {
        return rgbValue;
    }

    public static Color of(String name) {
        for (Color color : values()) {
            if (color.name().equalsIgnoreCase(name)) {
                return color;
            }
        }
        throw new IllegalArgumentException("color" +
                " with name " + name + " does not exist" +
                " in Color enum");
    }

    public static Color ofHexValue(String hexValue) {
        System.out.println("ofHexValue start");
        for (Color color : values()) {
            if (color.rgbValue.equals(hexValue)) {
                return color;
            }
        }
        throw new IllegalArgumentException("hex" +
                " value " + hexValue + " does not have" +
                "constant representation in Color");
    }

}
