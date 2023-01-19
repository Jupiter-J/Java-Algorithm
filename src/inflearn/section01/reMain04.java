package inflearn.section01;

import java.util.ArrayList;
import java.util.Scanner;

public class reMain04 {
    public static ArrayList<String>solution(int n, String[]str){
        ArrayList<String>answer = new ArrayList<>();
        for (String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
            /**
             넘어온 문자열타입 배열 str을 sb에 집어 넣어 뒤집고 빈 tmp 담는다
             담은 값들을 문자열 타입 배열 answer에 넣어 반환
             */
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++){
            str[i] = sc.next();
        }
        for (String x: solution(n, str)){
            System.out.println(x);
        }

    }
}
