package review;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum1=0;
        int n = 10;
        int [][]arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                sum1 += arr[i][j];
                System.out.print(arr[i][j]+ " ");
            //    System.out.println(j + "" +i);
            //    System.out.println(j + "" +i);
            }
        }
    }
}
