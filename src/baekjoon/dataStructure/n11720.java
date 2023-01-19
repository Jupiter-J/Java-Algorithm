package baekjoon.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class n11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sn = sc.next();

        char[] cn = sn.toCharArray();
        int add = 0;
        for (int i=0; i<cn.length; i++){
            add += cn[i] - '0'; //문자'0' == 숫자 48이다 , 문자 '5' == 숫자 53이다
        }
        System.out.print(add);
    }
}
