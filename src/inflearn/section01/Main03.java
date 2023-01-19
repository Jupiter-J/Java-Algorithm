package inflearn.section01;

import java.util.Scanner;

public class Main03 {
    public static String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE; //최댓값을 구하기 위해 가장 작은값으로 초기화
        String[] s= str.split(" "); //""기준으로 분리하여 배열에 넣겠다
        for (String x: s){
            int len= x.length(); //각각의 단어의 길이를 len에 저장
            if (len>m){
                m=len; //최댓값은 m으로 갱신
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
