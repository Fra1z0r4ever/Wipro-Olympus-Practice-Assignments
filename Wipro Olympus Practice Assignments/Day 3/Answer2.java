import java.util.Scanner;
public class Answer2 {
    static int sumOfDigits(int dig){
        if( dig == 0){
            return 0;
        }else{
            return(dig%10) + sumOfDigits(dig/10);
        }
    }
    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
       
        int dig = sc.nextInt();
        int sum = sumOfDigits(dig);

        System.out.println(sum);


    }
}