import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator");
        System.out.println("Enter a command:");
        String command = scanner.next();

        while(!Objects.equals(command, "quit")) {
            int num1 = scanner.nextInt();

            if(Objects.equals(command, "add")) {
                int num2 = scanner.nextInt();
                System.out.println(calculator.add(num1, num2));
            }
            else if(Objects.equals(command, "subtract")) {
                int num2 = scanner.nextInt();
                System.out.println(calculator.subtract(num1, num2));

            }
            else if(Objects.equals(command, "multiply")) {
                int num2 = scanner.nextInt();
                System.out.println(calculator.multiply(num1, num2));

            }
            else if(Objects.equals(command, "divide")) {
                int num2 = scanner.nextInt();
                System.out.println(calculator.divide(num1, num2));

            }
            else if(Objects.equals(command, "fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(num1));
            }
            else if(Objects.equals(command, "binary")) {
                System.out.println(calculator.intToBinaryNumber(num1));
            }

            command = scanner.next();
        }
    }
}
