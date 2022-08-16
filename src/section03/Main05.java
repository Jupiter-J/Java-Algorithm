package section03;

import java.util.Scanner;

public class Main05 {
    public static int solution(int n){
     int answer=0, sum = 0;
     int lt =0;
     int []arr = new int[n/2+1];
     for (int i=0; i<n/2+1; i++)
         arr[i] = i+1; // 빈 배열이기 때문에 1개씩 값 증가하여 집어넣기
         for (int rt=0; rt<n/2+1;rt++) {
             sum += arr[rt];
             if (sum == n) {
                 answer++;
             }
             while (sum >= n) {
                 sum -= arr[lt++];
                 if (sum == n) answer++;
             }
         }
     return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }
}
