package inflearn.String01;

import java.util.Scanner;

public class Main02 {
    public char[] soluiton(String str){
        char [] answer = new char[str.toCharArray().length];

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)<=89){
                answer[i] += (char)(str.charAt(i)+32);
            }else if(str.charAt(i) >=97){
                answer[i] += (char)(str.charAt(i)-32);;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.soluiton(str));
    }
}
