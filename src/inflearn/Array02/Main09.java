package inflearn.Array02;

import java.util.Scanner;

public class Main09 {
    public int solution(int n, int [][]square){
        int answer= 0;
        int max = Integer.MIN_VALUE;
        int sum1=0, sum2=0, cross1=0, cross2=0;
        // 행열 합
        for (int i=0; i<n; i++){
            sum1= sum2=0; //초기화
            for (int j=0; j<n; j++){
                sum1 += square[i][j];
                sum2 += square[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }


        //대각선 합
        for (int i=0; i<n; i++){
            cross1 += square[i][i];
            cross2 += square[i][n-i-1];
        }
        answer = Math.max(answer, cross1);
        answer = Math.max(answer, cross2);
        return answer;
    }
    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] square = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                square[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n,square));
    }
}
