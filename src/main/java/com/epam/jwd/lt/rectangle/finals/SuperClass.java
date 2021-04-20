package com.epam.jwd.lt.rectangle.finals;

public class SuperClass {

    public SuperClass() {
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("override me in SuperClass");
    }

    public void anotherOverrideMe() {
        overrideMe();
        System.out.println("override me in SuperClass");
    }
}
