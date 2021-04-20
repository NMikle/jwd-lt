package com.epam.jwd.lt.rectangle.interfaces;

public class Dog extends Animal implements Walkable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String walk() {
        return "Dog " + getName() + " walks";
    }

    @Override
    public String methodThatAcceptsString(String str) {
        return "!" + str + "!";
    }

    @Override
    public String defaultMethod(String str) {
        return Walkable.super.defaultMethod(str);
    }

    public static void main(String[] args) {
        final Walkable dog = new Dog("Lucy");
//        System.out.println(dog.walk());
        System.out.println(dog.defaultMethod("Wow"));
        Walkable.staticMethod();
    }
}
