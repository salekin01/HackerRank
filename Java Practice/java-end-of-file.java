import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> readList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNextLine()){
            String read = sc.nextLine();
            if(read == null || read.isEmpty()){
                break;
            }
            readList.add(read);
        }
        for(String item : readList){
            System.out.println(++i + " " + item);
        }
    }
}
