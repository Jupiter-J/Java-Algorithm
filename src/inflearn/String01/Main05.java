package inflearn.String01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main05 {
    public String solution(String str){
        String answer = "";
        String hi = "";
        ArrayList<Character> word = new ArrayList<>();

        for (int i=str.length()-1; i>=0; i--){
            if (Character.isAlphabetic(str.charAt(i))){
                word.add(str.charAt(i));
            }
            word.add(str.charAt(i));
        }
        return word.toString();
    }
    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
