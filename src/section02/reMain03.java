package section02;

import java.util.Scanner;

public class reMain03 {
    public static String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

            //찾지못하면 -1반환 함으로 (!= -1) 찾을때까지 반복
        while ((pos = str.indexOf(' '))!= -1){
            String tmp =  str.substring(0, pos); //0~pos 전 까지 문자를 리턴
            int len = tmp.length();
            if (len>m){ // >=를 하면 뒤쪽 단어가 답이 된다 (맨앞을 구하려면 >)
                m=len;
                answer = tmp;
            }
            str = str.substring(pos+1); //공백기준부터 뒤의 문자열 잘라서 위로 이동
        }
        if (str.length()>m) //공백기준이기 때문에 마지막 단어는 공백이 없어서 비교못함
            answer = str;   //직접 비교해주기
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
