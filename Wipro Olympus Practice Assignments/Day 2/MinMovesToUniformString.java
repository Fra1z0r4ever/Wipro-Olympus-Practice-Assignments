import java.util.Scanner;

public class MinMovesToUniformString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string
        String s = sc.nextLine();
        
        // Array to store frequency of each lowercase character
        int[] freq = new int[26];
        
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        
        // Find the maximum frequency
        int maxFreq = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }
        
        // Minimum moves = total length - max frequency
        int minMoves = s.length() - maxFreq;
        
        System.out.println(minMoves);
        sc.close();
    }
}