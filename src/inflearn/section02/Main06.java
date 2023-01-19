package inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main06 {
    public static boolean isPrime(int num){
        if (num == 1)
            return false; //1은 소수가 아니다
        for (int i=2; i<num; i++){
            if (num %i == 0) //약수구하기 {2부터 자기자신 전까지 나눈다}
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> solution(int n, int[]arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0; //뒤집힌 결과를 저장
            while(tmp >0){
                int t = tmp%10; //10으로 나눈 나머지는 '일의 자리수'
                res = res*10 +t;
                tmp = tmp/10;   //몫을 구하기 (/)
            } //0이 되면 나오기
            if (isPrime(res))
                answer.add(res);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
