import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] strArr = A.toCharArray();
        String isPalindrome = "Yes";
        for(int i = 0; i<strArr.length; i++){
            if(i <= strArr.length/2 && strArr[i] != strArr[(strArr.length - 1) -i]){
                isPalindrome = "No";
                break;
            } 
        }
        System.out.println(isPalindrome);    
    }
}
