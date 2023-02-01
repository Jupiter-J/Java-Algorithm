package inflearn.Array02;

import java.util.Scanner;

public class Main07 {
    public int solution(int n, int []arr){
        int answer = 0;

        for (int i=0; i<n; i++){
         if (arr[i] != 1){
             answer = 0;
         }
           answer +=1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }
}
