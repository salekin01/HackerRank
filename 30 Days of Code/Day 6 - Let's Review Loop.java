import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] outputStr = new String[n];
        String even = "";
        String odd = "";

        for(int i=0; i<n; i++){
            char[] inputStr = sc.nextLine().toCharArray();
            even = "";
            odd = "";
            for(int j=0; j<inputStr.length; j++){
                if(j%2 == 0){
                    even += inputStr[j];
                }
                else{
                    odd += inputStr[j];
                }
            }
            outputStr[i] = even + " " + odd;
        }
        for(String item : outputStr){
            System.out.println(item);
        }
    }
}