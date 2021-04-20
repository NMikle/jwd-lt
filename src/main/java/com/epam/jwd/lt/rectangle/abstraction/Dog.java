package com.epam.jwd.lt.rectangle.abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    String walk() {
        return "Dog " + getName() + " walks";
    }

    public static void main(String[] args) {
        final Animal dog = new Dog("Lucy");
        System.out.println(dog.talk());
    }
}
