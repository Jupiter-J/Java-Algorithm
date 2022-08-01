package section01;

import java.util.Locale;
import java.util.Scanner;

public class Main08 {
    public static String solution(String str){
        //알파벳만 따져야 한다
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]",""); //알파벳이 아닌것들은 빈문자로 한다
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp))
            answer="YES";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
