package src.controller;

import src.service.CalculatorService;

public class CalculatorController {
    
    private CalculatorService service = new CalculatorService();

    public double calculate(String op, double a, double b) {
        switch (op) {
            case "+":
                return service.add(a, b);
            case "-":
                return service.sub(a, b);
            case "*":
                return service.multiply(a, b);
            case "/":
                return service.divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
