package inflearn.section02;

import java.util.Scanner;

public class Main07 {
    public static int solution(int n, int[]arr){
        int result[] = new int[n];
        int score = 0;
        int answer =0;

        for (int i=0; i<n; i++){
            if (arr[i] == 1){
                answer++;
                result[i] = answer;
            }else
                answer=0;
                result[i] = answer;
        }
        for (int x : result){
            if (x > 0){
                score += x;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
