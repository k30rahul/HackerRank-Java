import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        if(s.trim().equals(""))
         {
             System.out.println("0");
             return;
         }
        String str[]=s.trim().split("[ !,?._'@]+");
        System.out.println(str.length);
        for(String i: str)  
            System.out.println(i);
    }
}

