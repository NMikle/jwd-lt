package com.epam.jwd.lt.rectangle.interfaces;

import java.io.Serializable;

public interface Walkable extends Serializable, Cloneable {

    String WALK_CONSTANT = "Something useful here";

    String walk();

    String methodThatAcceptsString(String str);

    default String defaultMethod(String str) {
        System.out.println(walk());
        return methodThatAcceptsString(str);
    }

    static void staticMethod() {
        System.out.println("Static in interface");
    }

}
