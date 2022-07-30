package section02;

import java.util.Locale;
import java.util.Scanner;

public class Main02 {
    public static String solution(String str){
        String answer = "";

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == str.toUpperCase().charAt(i))
                answer += str.toLowerCase().charAt(i);
            else
                answer += str.toUpperCase().charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
