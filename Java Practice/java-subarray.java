import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum;
        int negativeSumCount = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrElement = new int[n];
        for(int i=0; i<n; i++){
            arrElement[i] = sc.nextInt();
        }
        sc.close();
        int m;
        for(int i=0; i<n; i++){        //n layer, layer1: [1],[2],[3] layer2: [1,2],[2,3]
            for(int j=0; j<n-i; j++){       //no of sub array in a layer
                sum = 0;
                m = j;
                for(int k=0; k<=i; k++){    //no of elements within a sub array
                    sum += arrElement[m++]; //each elements
                }
                if(sum < 0){
                    negativeSumCount++;
                }
            }
        }
        System.out.println(negativeSumCount);
    }
}