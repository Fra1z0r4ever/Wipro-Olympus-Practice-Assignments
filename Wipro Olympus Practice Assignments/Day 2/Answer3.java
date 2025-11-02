import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {

        // write your answer here
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        String line = sc.nextLine();

        String[] words = line.split(" ");
        StringBuilder reversedLine = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedLine.append(reversedWord).append(" ");
        }

        System.out.println(reversedLine.toString().trim());
        sc.close();
    }
}
