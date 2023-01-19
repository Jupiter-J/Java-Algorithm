package inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public static ArrayList <Integer> solution(int n, int[]arr){
        ArrayList<Integer> answer = new ArrayList<>();
            answer.add(arr[0]); //0번은 무조건 출력
            for (int i=1; i<n; i++){
                if (arr[i] > arr[i-1]){ //앞의 수가 더 크면
                    answer.add(arr[i]);
                }
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
        for (int x : solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
