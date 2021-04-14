package com.epam.jwd.lt.rectangle.statics;

public class ExecutionOrder {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    static {
        System.out.println("static A");
    }

    {
        System.out.println("instance block A");
    }

    public A() {
        System.out.println("constructor A");
    }
}

class B extends A {
    static {
        System.out.println("static B");
    }

    {
        System.out.println("instance block B");
    }

    public B() {
        System.out.println("constructor B");
    }
}

class C extends B {
    static {
        System.out.println("static C");
    }

    {
        System.out.println("instance block C");
    }

    public C() {
        System.out.println("constructor C");
    }
}
