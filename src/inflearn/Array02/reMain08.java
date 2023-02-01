package inflearn.Array02;

import java.util.Scanner;

public class reMain08 {
    public int [] solution(int n, int []arr){
        int [] answer = new int[n];

        for (int i=0; i<n; i++){
           int cnt = 1;
           for (int j=0; j<n; j++){
               if (arr[j] > arr[i]) {
                   cnt++;
               }
               answer[i] = cnt; //cnt 다 정해진 뒤에 넣기
           }
        }
        return answer;
    }
    public static void main(String[] args) {
        reMain08 T = new reMain08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) System.out.print(x+ " ");
    }
}
