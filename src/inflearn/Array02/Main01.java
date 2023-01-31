package inflearn.Array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        answer.add(arr[0]);
        for (int i=1; i<n; i++){
            if (arr[i] > arr[i-1])
                answer.add(arr[i]);
        }
//        String result = answer.toString().replaceAll("[^0-9 ]","");
        System.out.println("1 : " + answer);
        System.out.println("2 : " + answer.toString());
        System.out.println("3 : " + answer.toString().replaceAll("[^0-9 ]",""));
        System.out.println("4 : " + answer.toString().replaceAll("^[0-9 ]",""));
        System.out.println("5 : " + answer.toString().replaceAll("^0-9 ",""));
        System.out.println("6 : " + answer.toString().replaceAll("[^0-9]",""));
        System.out.println("7 : " + answer.toString().replaceAll("[^\\d ]",""));
    }
}
