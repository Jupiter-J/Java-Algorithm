package inflearn.String01;

import java.util.Scanner;

public class reMain03_subString {
    public String solution(String str){
        String answer ="";
        int m= Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){ // true 가 될 때까지 반복
         String tmp = str.substring(0 , pos); // 0 ~ pos 전까지 자르기
         int len = tmp.length(); //그 문자의 길이를 len 저장
         if (len>m){ //문자열의 길이 최댓값 찾기 , 같은 길이 일경우 대비하여 크다로 표시하기
             m=len;
             answer = tmp;
            }
         str = str.substring(pos+1); //잘라낸 것 다음부터 사용하기 위해 pos +1
        }
        if (str.length()>m) answer = str; //마지막 단어는 tmp에 들어가지 못함 이를 방지
        return answer;
    }
    public static void main(String[] args) {
        reMain03_subString T = new reMain03_subString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
