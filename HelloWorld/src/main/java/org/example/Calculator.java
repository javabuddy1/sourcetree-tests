package org.example;

public class Calculator {
    public int add(int left, int right)
    {
        return left + right;
    }
    public int subtract(int left, int right)
    {
        return left - right;
    }

    public int multiply(int left, int right){
        return left * right;
    }

    public int division(int left, int right){
        if (right == 0){
            return 0;
        }
        return left / right;
    }

    public int modulus(int left, int right){
        return left % right;
    }
}
