import java.util.*;

public class Answer1 {

    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        List<Integer>  list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println("List before sort: " + list);
        Collections.sort(list);
        System.out.println("List after sort: " + list);
    }
}