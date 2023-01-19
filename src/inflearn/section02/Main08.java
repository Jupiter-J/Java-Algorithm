package inflearn.section02;

import java.util.Scanner;

public class Main08 {
    public static int[] solution(int n, int []arr){
        int[] answer = new int[n];
        int max = answer[0];
        for (int i=0; i<n; i++){ //기준
            int cnt =1; //처음에는 1등
            for (int j=0; j<n; j++){
                if (arr[j]> arr[i])
                    cnt++;
            }
            answer[i]=cnt; //등수를 집어넣는다
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
