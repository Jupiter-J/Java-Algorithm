package section01;

import java.util.Scanner;

public class Main09_2 {
    public static int solution(String str){
     String answer ="";
     for (char x : str.toCharArray()){
         if (Character.isDigit(x)){ //숫자인지 판별
          answer += x;
         }
     }
     return Integer.parseInt(answer); //숫자로 변환
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
