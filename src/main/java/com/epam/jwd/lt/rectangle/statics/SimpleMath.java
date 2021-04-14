package com.epam.jwd.lt.rectangle.statics;

public class SimpleMath {

    static double PI = 3.1415;
    static double EXP;

    static int add(int a, int b) {
        return a + b;
    }

    static {
        System.out.println("Static initialization block");
        EXP = 2.71828;
        System.out.println("After exponent initialization logic happens here");
    }

    //todo: main here for log change
}

class App {
    public static void main(String[] args) {
        System.out.println("Program start");
        System.out.println(SimpleMath.PI);
        System.out.println(SimpleMath.add(1, 2));

        SimpleMath one = new SimpleMath();
        SimpleMath two = new SimpleMath();

        System.out.println(one.PI);

        one.PI = 2.71828;
        System.out.println(two.PI);
    }
}
