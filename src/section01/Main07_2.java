package section01;

import java.util.Scanner;

public class Main07_2 {
    public static String solution(String str){
        String answer = "NO";
        String sb = new StringBuilder(str).reverse().toString();
        if (sb.equalsIgnoreCase(sb))
            answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
