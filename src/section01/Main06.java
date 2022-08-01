package section01;

import java.util.Scanner;

public class Main06 {
    public static String solution(String str){
     String answer = "";
     for (int i=0; i< str.length() ; i++){
       if (str.indexOf(str.charAt(i))==i){ //처음 발견된 위치(indexOf)와 인덱스(i) 위치가 같을 경우
           answer += str.charAt(i); //처음발견된 값을  answer 누적
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
