package org.example;

public class Runner {
    public void run() {
        System.out.println("Hello world!");
        System.out.println("This is line 2");
        System.out.println("This is line 3");
        System.out.println("Greetings from User 2");
        System.out.println("this change was made by User 2");

        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 7);
        System.out.println(sum);

        System.out.println("The difference between 5 and 7 is "+ calculator.subtract(5, 7));
        System.out.println("The product of 5 and 7 is " + calculator.multiply(5, 7));
        System.out.println("The quotient of 20 and 3 is " + calculator.division(20, 3));
        System.out.println("The modulus of 20 and 3 is " + calculator.modulus(20, 3));
    }
}
