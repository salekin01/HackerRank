import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);                     // Jan=0, Feb=1, Dec=11
        //System.out.println(c.getTime().toString());
        int dayOfWeek = c.get(c.DAY_OF_WEEK);             // Sunday=1, Monday=2, Sat=7
        String dayStr = null;
        
        switch (dayOfWeek) {
        case 1:
            dayStr = "SUNDAY";
            break;
        case 2:
            dayStr = "MONDAY";
            break;
        case 3:
            dayStr = "TUESDAY";
            break;
        case 4:
            dayStr = "WEDNESDAY";
            break;
        case 5:
            dayStr = "THURSDAY";
            break;
        case 6:
            dayStr = "FRIDAY";
            break;
        case 7:
            dayStr = "SATURDAY";
            break;
        }
        //System.out.println(dayStr);
        return dayStr;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}