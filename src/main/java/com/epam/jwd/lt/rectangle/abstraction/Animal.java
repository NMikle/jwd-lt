package com.epam.jwd.lt.rectangle.abstraction;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String talk();

    abstract String walk();

}
