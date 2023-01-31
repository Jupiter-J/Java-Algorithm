package inflearn.Array02;

import java.util.Scanner;

public class reMain04 {
    public void solution(int n){

        int a=1, b=1, c;
        System.out.print(a + " " +b );
        for (int i=2; i<n; i++){
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        reMain04 T = new reMain04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
