package section02;

import java.util.Locale;
import java.util.Scanner;

public class reMain01 {
    public static int solution(String str, char c){
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == c)
                answer +=1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c));
    }
}
