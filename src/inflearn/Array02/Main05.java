package inflearn.Array02;

import java.util.Scanner;

public class Main05 {
    public int solution(int n){
        int answer = 1;
        int result = 0;

        for (int i=3; i<n; i++){
            result = n %= i ;
            if ( result != 0){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
