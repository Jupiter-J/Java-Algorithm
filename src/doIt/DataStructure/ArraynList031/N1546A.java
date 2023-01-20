package doIt.DataStructure.ArraynList031;

import java.util.Scanner;

public class N1546A {
    public static void main(String[] args) {
        //for문으로 최댓값, 합 한번에 구하기
        //double을 다른 형식으로 변환하기

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []result = new int[n];

        int max=0;
        int add=0;
        double answer=0;
        for (int i=0; i<n; i++){
            result[i] = sc.nextInt();
            if (result[i] >max) max = result[i];
            add += result[i];
        }
        answer = add*100.0/max/n;
        System.out.println(answer);
    }
}

