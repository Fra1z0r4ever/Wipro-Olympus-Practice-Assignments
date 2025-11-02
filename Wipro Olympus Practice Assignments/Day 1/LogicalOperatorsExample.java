import java.util.Scanner;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input1 = scanner.nextBoolean();
        boolean input2 = scanner.nextBoolean();
        
        // TODO: Write your code here
        boolean result1 = input1 && input2;
        System.out.println(result1);
        boolean result2 = input1 || input2;
        System.out.println(result2);
    }
}