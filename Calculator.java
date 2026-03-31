// Changes to be made :-
// Separation of concern 
// add exception handling
// add enums for operations

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is undefined");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("---- SIMPLE CLI CALCULATOR ----");
            System.out.print("Enter operation :- ( + , - , * , / ) or exit : ");
            String op = sc.next();
            
            if(op.equalsIgnoreCase("exit")){
                System.out.println("---- CLI Calculator Closed ----");
                System.out.println("-------------------------------");
                break;
            }

            System.out.println("Enter two numbers:-");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            switch (op) {
                case "+":
                    System.out.println("Answer :- "+Calculator.add(a, b));
                    break;

                case "-":
                    System.out.println("Answer :- "+Calculator.sub(a, b));
                    break;

                case "*":
                    System.out.println("Answer :- "+Calculator.multiply(a, b));
                    break;

                case "/":
                    System.out.println("Answer :- "+Calculator.divide(a, b));
                    break;

                default:
                    System.out.println("Invalid operation, Choose again.");
                    break;
            }
        }
        sc.close();
    }
}