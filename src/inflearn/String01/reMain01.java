package inflearn.String01;

import java.util.Scanner;

public class reMain01 {
    public int soultion(String str, char t){
        int answer =0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == t){ //toCharArray 쓰는 것 보다 빠르다
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        reMain01 T = new reMain01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0); //문자 하나 입력받기
        System.out.println(T.soultion( str, c));
    }
}
