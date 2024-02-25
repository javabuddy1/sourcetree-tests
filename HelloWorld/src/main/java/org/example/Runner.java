package org.example;

public class Runner {
    public void run() {
        System.out.println("Hello world!");
        System.out.println("This is line 2");
        System.out.println("This is line 3");
        System.out.println("Greetings from User 2");

        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 7);
        System.out.println(sum);
    }
}
