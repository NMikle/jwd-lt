package com.epam.jwd.lt.rectangle.finals;

public class ChildClass extends SuperClass {

    private final String someField;

    public ChildClass(String someField) {
        this.someField = someField;
    }


    @Override
    public void overrideMe() {
        System.out.println(someField);
    }

    public static void main(String[] args) {
        final ChildClass childObj = new ChildClass("Hello World");
        childObj.overrideMe();
    }
}
