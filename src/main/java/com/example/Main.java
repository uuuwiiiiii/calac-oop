package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        char operation;
        try (Scanner scanner = new Scanner(System.in)) {
            firstNumber = scanner.nextInt();
            operation = scanner.next().charAt(0);
            secondNumber = scanner.nextInt();
        }
        catch(Exception e) {
            System.out.println("It's not correct expression");
            return;
        }
        double result = 0;
        switch(operation) {
            case '+': {
                result = firstNumber + secondNumber;
                break;
            }
            case '-': {
                result = firstNumber - secondNumber;
                break;
            }
            case '*': {
                result = firstNumber * secondNumber;
                break;
            }
            case '/': {
                try {
                    result = firstNumber / secondNumber;
                }
                catch(Exception e) {
                    System.out.println("Warning! Exception has been thrown");
                    return;
                }
            }
            default:
                break;
        }

        System.out.println(result);
    }
}