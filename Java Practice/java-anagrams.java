import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        char[] strArrA = a.toLowerCase().toCharArray();
        char[] strArrB = b.toLowerCase().toCharArray();
        
        int[] charCountArrA = new int[26];
        int[] charCountArrB = new int[26];
        
        for(int i=0; i<a.length(); i++) {
            int position1 =  (int)strArrA[i] - 97; //here 97 is ASCII value
            charCountArrA[position1]++;
            int position2 =  (int)strArrB[i] - 97;
            charCountArrB[position2]++;
        }
        for(int i=0; i<charCountArrA.length; i++) {
            if(charCountArrA[i] != charCountArrB[i]) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}