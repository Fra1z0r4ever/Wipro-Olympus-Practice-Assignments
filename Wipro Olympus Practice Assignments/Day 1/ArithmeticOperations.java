import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        int num1 =  scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1+num2;
        System.out.println("Sum: " + sum);
        int diff = num1-num2;
        System.out.println("Difference: " + diff);
        int mul = num1*num2;
        System.out.println("Product: " + mul);
        int div = num1/num2;
        System.out.println("Quotient: " + div);
        int rem = num1%num2;
        System.out.println("Remainder: " + rem);
        scanner.close();
    }
}