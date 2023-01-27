package inflearn.String01;

import java.util.Scanner;

public class Main04 {
    public String solution(int n, String str){
        String answer = "";

        for (int i=str.length()-1; i>=0 ; i--){
            answer = answer + str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       String word = "";
        for (int i=0; i<n; i++){
            word = sc.next();
            System.out.println(T.solution(n, word));
        }
    }
}
