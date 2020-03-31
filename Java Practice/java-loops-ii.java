import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result;
            int powRes;
            for(int j=0;j<n;j++){
                result = 0;
                for(int k=0;k<=j;k++){
                    powRes = 1;
                    for(int pow=0;pow<=k;pow++){  //2 to the power
                        powRes *= (pow == 0)? 1 : 2;
                    }
                    result += powRes * b;
                }
                result += a;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
