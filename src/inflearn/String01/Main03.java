package inflearn.String01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main03 {
    public String solution(String str){
        String answer = "";
        int count = 0;
        char []saveWord = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if (saveWord[i] == ' '){
                answer += str.substring(i);
                count++;
            }
            System.out.println("count : " + count);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main03 T = new Main03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
