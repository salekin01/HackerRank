import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        System.out.println( (int)(A.charAt(0)) > (int)(B.charAt(0)) ? "Yes" : "No");

        String remainingA = A.substring(1);
        String remainingB = B.substring(1);

        System.out.println(String.valueOf(A.charAt(0)).toUpperCase() + remainingA + " " + String.valueOf(B.charAt(0)).toUpperCase() + remainingB);

        
        
    }
}



