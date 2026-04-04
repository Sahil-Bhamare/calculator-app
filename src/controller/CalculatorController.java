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
            case "sq":
                return service.square(a); // adding enum solves the uniformity problem (unary vs binary)
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
