package inflearn.section01;

import java.util.Scanner;

public class Main12 {
    public static String solution(int n, String s){
        String answer="";
        for (int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#','1').replace('*','0');
            int num=Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        // 7자리의 이진수로 변경
        // # : 이진수의 1, * 이진수의 0
        // 바뀐 2진수를 10진수화
        // 아스키 번호가 문자로 변환
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }
}
