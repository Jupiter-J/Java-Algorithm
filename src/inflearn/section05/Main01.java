package inflearn.section05;

import java.util.Scanner;
import java.util.Stack;


public class Main01 {
    public static String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
           if (x== '(') stack.push(x);
           else{ //닫는 괄호일때
               //여는 괄호가 없음으로 짝이 없어서 NO
               if (stack.isEmpty()) return "NO";
               //여는 괄호가 있으면 여는 괄호 없애기
               stack.pop();
           }
        }
        // for 문이 끝나고 여는 괄호가 많은 상황
        if (!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
