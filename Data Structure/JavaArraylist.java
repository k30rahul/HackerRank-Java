import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    ArrayList[] a = new ArrayList[n];
    for(int i=0;i<n;i++){
        int k = in.nextInt();
        a[i] = new ArrayList();
        for(int j=0;j<k;j++){  
            a[i].add(in.nextInt());                
        }
    }
    int q=in.nextInt();
    for(int i=0;i<q;i++){
       int  x=in.nextInt();
        int y=in.nextInt();
        try{
            System.out.println(a[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
    }
}

