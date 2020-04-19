import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int smallestVal = 0;
        int largestVal = 0;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int temp;
        int startingPoint = 0;
        for(int i=0; i+k<=s.length(); i++){
            temp = 0;
            for(int j=0; j<k ; j++){
                startingPoint = i;
                temp += (int)s.charAt(startingPoint++);
            }
            if(smallestVal == 0 && largestVal == 0){  //only for first time
                smallestVal = temp;    
                largestVal = temp;
                smallest = s.substring(i,i+k);   
                largest = smallest;
            }
            if(temp < smallestVal){
                smallestVal = temp;
                smallest = s.substring(i,i+k);   
            }
            if(temp > largestVal){
                largestVal = temp;
                largest = s.substring(i,i+k); 
            }
            //System.out.println(s.substring(i,i+k) + "-" + temp);
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}