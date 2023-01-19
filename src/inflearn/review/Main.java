package inflearn.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int n, int m, int[]arr1, int []arr2){
     ArrayList<Integer>answer = new ArrayList<>();
     int p1, p2 = 0;

     return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int m = sc.nextInt();
        int arr2[] = new int [m];

        for (int x : arr1 ){
            x = sc.nextInt();
        }
        for (int y : arr2){
            y = sc.nextInt();
        }

        for (int h: solution(n, m, arr1, arr2)){
            System.out.print( h + " ");
        }

    }
}
