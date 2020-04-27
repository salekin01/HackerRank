import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q, x, y; 
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> modified = new ArrayList<ArrayList<Integer>>();
        modified.add(new ArrayList<Integer>());  //Assign nothing to line0, as counting start from line1

        n = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<n; i++){
            String[] temp = sc.nextLine().split(" ");
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            for(int j=0; j<temp.length; j++){             
                tempList.add(Integer.parseInt(temp[j]));
            }
            modified.add(tempList);
        }
        
        q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++) {
            String temp = sc.nextLine();
            String[] tempArr = temp.split(" ");
            x = Integer.parseInt(tempArr[0]);  //line
            y = Integer.parseInt(tempArr[1]);  //index
            
            if(y > modified.get(x).size()-1) {
                System.out.println("ERROR!");
            }
            else {
                System.out.println(modified.get(x).get(y));
            }
        }
    }
}
