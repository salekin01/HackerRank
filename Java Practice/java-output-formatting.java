import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                s1 = s1.format("%-15s", s1).replace(" ", " "); //rightPad upto 15 cha.
                System.out.print(s1);
                String x1= Integer.toString(x);
                x1 = x1.format("%3s", x1).replace(" ", "0");   //leftPad upto 3 cha.
                System.out.println(x1);
            }
            System.out.println("================================");
    }
}
