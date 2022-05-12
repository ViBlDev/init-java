package fr.m2i;

public class Calculator {

    int result;

    public int addition(int number1, int number2){
        result = number1 + number2;
        return result;
    }

    public int subtraction(int number1, int number2){
        result = number1 - number2;
        return result;
    }
    public float division(int number1, int number2) {
        result = number1 / number2;
        return result;
    }
    public int multiplication(int number1, int number2){
        result = number1 * number2;
        return result;
    }
}

