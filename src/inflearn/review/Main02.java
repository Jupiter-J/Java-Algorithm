package inflearn.review;

import java.util.Scanner;

public class Main02 {
    public static int solution(String str){
        int answer=0;
        for (char x : str.toCharArray()){
           if (Character.isDigit(x)){
               answer += x;
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
