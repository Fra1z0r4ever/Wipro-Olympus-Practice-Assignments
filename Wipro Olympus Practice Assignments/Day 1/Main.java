import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //write your answer here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        if(num1%2==0){
            System.out.println("No is Even");
        }else{
            System.out.println("No is odd");
        }
    }
}