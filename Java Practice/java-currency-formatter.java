import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat formatter1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatter1.format(payment);
        
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formatter2.format(payment);
        
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatter3.format(payment);
        
        NumberFormat formatter4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatter4.format(payment);
             
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}