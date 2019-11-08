import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,count=0;
        int a[]=new int[n];
         for (int i=0;i<n;i++)
         a[i]=sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=a[j];
                count= sum<0 ?count+1:count;
            }
            sum=0;   
        }
        System.out.println(count);
    }
}

