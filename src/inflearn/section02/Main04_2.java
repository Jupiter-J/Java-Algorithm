package inflearn.section02;

import java.util.Scanner;

public class Main04_2 {
    public static  void solution(int n){
        int a =1, b=1, c;
        System.out.println(a+ " " + b + " ");
        for (int i=2; i<n; i++){
            c=a+b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
