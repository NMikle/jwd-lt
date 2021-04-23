package com.epam.jwd.lt.rectangle.poly;

import com.epam.jwd.lt.rectangle.interfaces.Animal;

import java.io.File;
import java.io.PrintStream;

public class Cat extends Animal implements Talkable {
    public Cat(String name) {
        super(name);
        System.out.println(talk(this));
    }

    @Override
    public String talk() {
        return "Meow";
    }

    public String talk(Cat cat) {
        return this.talk() + " and then " + cat.talk();
    }

    public static void main(String[] args) {
//        final TalkService service = new TalkService();
        final Cat boris = new AnotherCat("Boris");
//        service.makeItTalk(boris);
        System.out.println(boris);
    }
}

class AnotherCat extends Cat {

    public AnotherCat(String name) {
        super(name);
    }

    @Override
    public String talk(Cat cat) {
        return "nothing";
    }

    @Override
    public String toString() {
        return "AnotherCat{name=\"" + getName() + "\"}";
    }
}
