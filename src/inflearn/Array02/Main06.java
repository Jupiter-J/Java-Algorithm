package inflearn.Array02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main06 {
    public boolean isPrime(int num){
        if (num ==1) return false;
        for (int i=2; i<num; i++){
            if (num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int []arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int reverse = 0;
        for (int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main06 T = new Main06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
