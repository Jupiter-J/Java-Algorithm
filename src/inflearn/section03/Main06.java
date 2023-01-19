package inflearn.section03;

import java.util.Scanner;

public class Main06 {
    public static int solution(int n, int k, int []arr){
        int answer = 0;
        int cnt=0; //0을 1로 바꾼 횟수
        int lt=0;

     for (int rt=0; rt<n; rt++){
         if (arr[rt]==0) cnt++;
         //0을 바꾼 횟수를 k 이하로 제한
        while(cnt>k){
            //lt는 rt가 바꾼 1을 다시 0으로 변경
            if (arr[lt]==0) cnt--;
            lt++;
        }                         //길이 구하기
        answer = Math.max(answer, rt-lt+1);
     }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }
}
