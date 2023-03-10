import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = Integer.parseInt(args[1]);

        if(Objects.equals(args[0], "add")) {
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.add(num1, num2));
        }
        else if(Objects.equals(args[0], "subtract")) {
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.subtract(num1, num2));

        }
        else if(Objects.equals(args[0], "multiply")) {
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.multiply(num1, num2));

        }
        else if(Objects.equals(args[0], "divide")) {
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.divide(num1, num2));

        }
        else if(Objects.equals(args[0], "fibonacci")) {
            System.out.println(calculator.fibonacciNumberFinder(num1));
        }
        else if(Objects.equals(args[0], "binary")) {
            System.out.println(calculator.intToBinaryNumber(num1));
        }
    }
}
