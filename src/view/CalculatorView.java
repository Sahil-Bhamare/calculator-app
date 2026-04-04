package src.view;

import java.util.Scanner;

import src.controller.CalculatorController;

public class CalculatorView {
    private Scanner sc = new Scanner(System.in);
    private CalculatorController controller = new CalculatorController();

    public void start() {
        while (true) {
            System.out.println("\n-------------------------------");
            System.out.println("---- SIMPLE CLI CALCULATOR ----");
            System.out.print("\nEnter operation (+, -, *, /, sq) or exit: ");

            String op = sc.next();

            if (op.equalsIgnoreCase("exit")) {
                System.out.println("\n---- CLI Calculator Closed ----");
                System.out.println("-------------------------------");
                break;
            }
            if (op.equalsIgnoreCase("sq")){
                System.out.println("Enter one number:");
                double a = sc.nextDouble();
                double b = 0;
                double result = controller.calculate(op, a, b);
                System.out.println("Answer: " + result);
                
            }else{
                try {
                    System.out.println("Enter two numbers:");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
    
                    double result = controller.calculate(op, a, b);
                    System.out.println("Answer: " + result);
    
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine(); // to clear buffer
                }
            }

        }
        sc.close();
    }
}

