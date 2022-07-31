package section02;

import java.util.Scanner;

// lt와 rt가 둘다 알파벳을 가리키고 있을때 교환
public class Main05 {
    public static String solution(String str){
        String answer = "";
       char[]s = str.toCharArray(); //char 타입 배열 생성
        int lt=0, rt=str.length()-1; //배열의 길이 -1이 인덱스의 끝번호
        while (lt<rt){
            if (!Character.isAlphabetic(s[lt]))
                lt++;
            else if (!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp=s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); //들어온 s의 값을 문자열로 변환
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
