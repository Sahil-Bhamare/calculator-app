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
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---- SIMPLE CLI CALCULATOR ----");
            System.out.print("Enter operation :- ( + , - , * , / ) or exit : ");
            String op = sc.next();

            if(op.equalsIgnoreCase("exit")){
                System.out.println("CLI Calculator Closed...");
                break;
            }

            System.out.println("Enter two numbers:-");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            switch (op) {
                case "+":
                    System.out.println(Calculator.add(a, b));
                    break;

                case "-":
                    System.out.println(Calculator.sub(a, b));
                    break;

                case "*":
                    System.out.println(Calculator.multiply(a, b));
                    break;

                case "/":
                    System.out.println(Calculator.divide(a, b));
                    break;

                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
        sc.close();
    }
}