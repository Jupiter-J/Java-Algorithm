package section02;

import java.util.Scanner;

public class Main05 {
    public static int solution(int n){
        int answer =0;
        int[] ch = new int[n+1]; //체크배열 {인덱스 번호가 n번까지 생기기 위하여}
            // 0,1은 제외
        for (int i=2; i<=n ; i++){
            if (ch[i]==0){ //소수
                answer++;
                for (int j=i; j<=n; j=j+i){ // i배수들을 체크
                    ch[j]=1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
