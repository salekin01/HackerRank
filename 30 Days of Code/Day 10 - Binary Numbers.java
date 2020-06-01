import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        ArrayList<Integer> binaryList = new ArrayList<Integer>();
        ArrayList<Integer> binaryReverseList = new ArrayList<Integer>();
        while(n > 0){
            binaryList.add(n % 2);
            n = n/2;
        }
        int highestIndex = binaryList.size() -1;

        //reverse binary data
        while (highestIndex > -1){   
            binaryReverseList.add(binaryList.get(highestIndex--));
        }

        int tempCount = 0;
        int finalCount = 0;
        for(int item : binaryReverseList){
            if(item == 1){
                tempCount++;
                if(tempCount > finalCount){
                    finalCount = tempCount;
                }
            }
            if(item == 0){
                tempCount = 0;
            }
        }
        System.out.println(finalCount);
    }
}
