package baekjoon;

import java.util.Scanner;

public class n11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        for(int i = 0; i<n; i++){
            int num;
            num = sc.nextInt();
            result += num;
        }
        System.out.println(result);
    }
}
