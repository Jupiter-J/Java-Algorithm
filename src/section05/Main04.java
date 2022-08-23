package section05;

import java.util.Scanner;
import java.util.Stack;

public class Main04 {
    public static int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()){
                    //숫자면 스텍에 집어 넣기       아스키코드 - 48('0') = 해당 값
            if( Character.isDigit(x)) stack.push(x -48);
            else{
                int rt = stack.pop();
                int lt = stack.pop(); //계산되는 대상 (나중에 나오는 것)
                if (x== '+') stack.push(lt +rt);
                else if (x == '-') stack.push(lt -rt);
                else if (x == '*') stack.push(lt *rt);
                else if (x == '/') stack.push(lt /rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
