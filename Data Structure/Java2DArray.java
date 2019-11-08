import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = new int[6][6];
        int max=-100000;
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                a[i][j] = arrItem;
            }
        }

        scanner.close();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                int row1=a[i][j-1]+a[i][j]+a[i][j+1];
                int row2=a[i+1][j];
                int row3=a[i+2][j-1]+a[i+2][j]+a[i+2][j+1];
            max=row1+row2+row3>max ? row1+row2+row3:max;
            }
           
    }
    System.out.print(max);
}
}
