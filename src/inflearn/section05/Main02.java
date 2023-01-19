package inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Main02 {
    public static String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()){
            //닫는괄호
            if (x == ')'){
                // ( 포함 꺼낸다
                while(stack.pop()!='(');
            }else stack.push(x); //여는 괄호와 알파벳을 넣기
        }
        for (int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
