//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<String, Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hmap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hmap.containsKey(s)){
                System.out.println(s + "=" + String.valueOf(hmap.get(s)));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}