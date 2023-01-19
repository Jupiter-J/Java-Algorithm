package inflearn.section01;

import java.util.Scanner;

public class reMain11 {
    public static  String solution(String str){
        String answer ="";
        str = str+" "; //빈 문자를 집어 넣음
        int num=1;

        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                num++;
            }else{
                answer += str.charAt(i);
                if (num>1)
                    answer += String.valueOf(num);
                num =1;
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
