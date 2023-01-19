package inflearn.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main07 {
    public static String solution (String str1, String str2){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : str1.toCharArray()) Q.offer(x);

        for (char y : str2.toCharArray()){
            if (Q.contains(y)){
                    // 반환 후 삭제
                if (Q.poll() != y) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
