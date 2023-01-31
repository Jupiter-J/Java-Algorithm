package inflearn.Array02;

import java.util.Scanner;

public class reMain02 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for (int i=1; i<n; i++){
            if (max < arr[i]){
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        reMain02 T = new reMain02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for ( int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
