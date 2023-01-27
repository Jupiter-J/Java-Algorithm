package inflearn.String01;

import java.util.Scanner;

public class reMain03 {
    public String solution (String str){
        String answer = "";
        int max = Integer.MIN_VALUE;
        String [] world = str.split(" ");
        for (String x : world){
            int len = x.length(); //단어의 길이
            if (len> max){
                max = len;
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        reMain03 T = new reMain03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //enter 개행문자 기준임으로 nextLine 필요
        System.out.println(T.solution(str));
    }
}
