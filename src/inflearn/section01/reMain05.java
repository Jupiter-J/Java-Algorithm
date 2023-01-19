package inflearn.section01;

import java.util.Scanner;

public class reMain05 {
    public static String solution(String str){
        String answer = "";
        char []n = str.toCharArray();
        int lt=0, rt=n.length-1;
        while(lt<rt){
         if ( !Character.isAlphabetic(n[lt]))
             lt++;
         else if(!Character.isAlphabetic(n[rt]))
             rt--;
         else{
             char tmp = n[lt];
             n[lt] = n[rt];
             n[rt] = tmp;
             lt++;
             rt--;
         }
        }
        answer = String.valueOf(n);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
