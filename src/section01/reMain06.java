package section01;

import java.util.Scanner;

public class reMain06 {
    public static String solution(String str){
     String answer = "";
     for (int i=0; i<str.length(); i++){
        if (str.indexOf(str.charAt(i))==i){ //indexOf(CharAt() 반환문자)=> 반환된 인덱스 == i 인덱스 비교
            answer += str.charAt(i);
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
