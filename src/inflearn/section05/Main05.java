package inflearn.section05;

import java.util.Scanner;
import java.util.Stack;

public class Main05 {
    public static int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
                                        //여는 괄호는 바로 넣기
            if (str.charAt(i) == '(') stack.push('(');
                //닫는 괄호
            else{
                    //여는 괄호 빼기
                stack.pop();
                //레이저인지 막대기인지 확인  , 레이저일 경우 stack에 있는 막대기 갯수누적
                if (str.charAt(i-1) == '(') answer += stack.size();
                    //막대기의 끝이기 때문에 +1 증가
                else answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }
}
