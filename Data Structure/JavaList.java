import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            List.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
                String insert = sc.next();
                if(insert.equals("Insert")) {
                      List.add(sc.nextInt(), sc.nextInt()); 
                } 
                else {
                    List.remove(sc.nextInt());    
            }
        }
    
    for(Object i:List)
        System.out.print(i+" ");
    }
}

