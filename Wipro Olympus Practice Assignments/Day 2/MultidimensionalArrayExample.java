import java.util.Scanner;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        int rows= scanner.nextInt();
        int columns= scanner.nextInt();
        int[][] arr = new int[rows][columns];
        for(int i=0;i<arr.length;i++){
             for (int j=0; j<columns;j++){
                 arr[i][j]=scanner.nextInt();
             }   
        }
    for (int i = 0; i < rows; i++) {
       for (int j = 0; j < columns; j++) {
           System.out.print(arr[i][j] + " ");
       }
       System.out.println();
   }
        scanner.close();
    }
}