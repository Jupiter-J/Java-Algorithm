package baekjoon;

import java.util.Scanner;

public class rn11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        String line = sc.next();
        for (int i=0; i<n; i++){
            sum+= line.charAt(i)-'0'; //'0'=48을 의미
        }
        System.out.println(sum);
    }
}
