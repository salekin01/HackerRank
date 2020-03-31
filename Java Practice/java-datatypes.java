import java.util.*;
import java.io.*;


class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                
                long powRes;
                for(int j=15; j<64; j+=j+1){   //j=15,31,63
                    powRes = 1;
                    for(int pow=0; pow<=j; pow++){
                        powRes *= (pow == 0)?1: 2;
                    }
                    if(j==15 &&  x>=(powRes * (-1)) && x<=(powRes-1))
                          System.out.println("* short");
                    if(j==31 &&  x>=(powRes * (-1)) && x<=(powRes-1))
                          System.out.println("* int");
                    if(j==63 &&  x>=(powRes * (-1)) && x<=(powRes-1))
                          System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



