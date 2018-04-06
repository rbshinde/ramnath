package com.ramnath.hackerranktests;
import java.io.*;
import java.math.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class ChnageTimeFormate_12To24 {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        
        //System.out.println(s);
    	
    	/*SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
        Date date = null;
		try {
			date = parseFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
       
        
        return displayFormat.format(date);*/
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        bw.write(result);
        bw.newLine();

        bw.close();
        */

        String result = timeConversion("07:05:45PM");
        System.out.println(result);

    }
}
