package section02;

import java.util.Locale;
import java.util.Scanner;

public class Main01 {
    public static int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase(); //단어를 대문자화
        t = Character.toUpperCase(t); //문자를 대문자화 char!

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //문자열 입력
        char c = sc.next().charAt(0); //한 문자

        System.out.print(solution(str, c));
    }
}
