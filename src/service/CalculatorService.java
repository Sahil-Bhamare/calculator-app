package src.service;

public class CalculatorService {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by 0");
        }
        return a / b;
    }

    public double square(double a){
        return a*a;
    }
    public double cube(double a){
        return a*a*a;
    }
}
