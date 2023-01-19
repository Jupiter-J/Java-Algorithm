package inflearn.section01;

import java.util.Scanner;

public class Main07 {
    public static String solution(String str){
     String answer = "YES";
     str = str.toUpperCase(); //대문자 변환
     int len = str.length();

    for (int i=0; i<len/2; i++){ //반으로 나눠서 비교
     if (str.charAt(i) != str.charAt(len-i-1)){ //처음과 끝값이 다르면 NO
        answer="NO";
     }
    }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
