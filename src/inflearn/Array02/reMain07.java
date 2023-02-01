package inflearn.Array02;

import java.util.Scanner;

public class reMain07 {
    public int solution(int n, int []arr){
        int answer = 0;
        int cnt = 0;

        for (int i=0; i<n; i++){
         if (arr[i] == 1){
            cnt++;
            answer += cnt;
         }else cnt=0;
        }
        return answer;
    }
    public static void main(String[] args) {
        reMain07 T = new reMain07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }
}
