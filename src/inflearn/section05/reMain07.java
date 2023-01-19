package inflearn.section05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reMain07 {
    public static ArrayList<Integer>solution(int []arr){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int x : arr){
            answer.add(x);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
    }
}
