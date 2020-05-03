import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        if(s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        //String[] arrStr = s.split("!|,|\\?|\\.|_|'|@| "); //not worked
        String[] arrStr = s.trim().split("[-!,?._'@ ]+");
        
        System.out.println(arrStr.length);
        for(String item : arrStr) {
            System.out.println(item);
        }
    }
}
