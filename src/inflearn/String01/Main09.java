package inflearn.String01;

import java.util.Scanner;

public class Main09 {
    public String solution(String str){
     String answer = "";

     answer = str.replaceAll("[^0-9 ]","");
     if (answer.charAt(0) == '0') {
         answer = answer.substring(1);
     }

     return answer;
    }
    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
