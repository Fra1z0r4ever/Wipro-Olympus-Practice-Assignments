import java.util.Scanner;
// Java program to remove
// elements from HashMap
import java.io.*;
import java.util.*;
public class Answer4 {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        //write your answer here
        String[] str =s.nextLine().split("\\s+");
        HashMap<Integer,String> name = new HashMap<>();

        for(int i =1; i<=4;i++){
            name.put(i,str[i-1]);
        }

        int keytoRm = Integer.parseInt(str[4]);

        System.out.println("Mappings of HashMap are : " + name);
        name.remove(keytoRm);
        System.out.println("Mappings after removal are : " + name);
    }
}