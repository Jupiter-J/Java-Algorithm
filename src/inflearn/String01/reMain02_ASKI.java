package inflearn.String01;

import java.util.Scanner;

public class reMain02_ASKI {
    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()){
            if (x >= 97 && x<=122)
                answer += (char)(x-32);
            else
                answer += (char)(x+32);
        }
        return answer;
    }
    public static void main(String[] args) {
        reMain02_ASKI T = new reMain02_ASKI();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
