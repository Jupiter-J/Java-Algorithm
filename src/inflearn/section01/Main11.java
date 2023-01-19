package inflearn.section01;

import java.util.Scanner;

public class Main11 {
    public static String solution(String str){
     String answer = "";
 //    str = str+" "; // 빈공간을 넣어준다 out-of-range 에러
     int cnt=1;
                        //빈공간 전까지만 돌려준다
        for (int i=0; i< str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                cnt ++;
            }else {
                answer += str.charAt(i);
                if (cnt>1)      //
                    answer += String.valueOf(cnt);
                cnt=1;
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
