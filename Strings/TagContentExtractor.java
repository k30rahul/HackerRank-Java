import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-->0){
			String line = in.nextLine();
			
          	//Write your code here
            
            Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
            int flag=0;
            while (m.find()) {
                System.out.println(m.group(2));
                flag=1;
            }
            if ( flag==0) 
                System.out.println("None");

		}
	}
}



