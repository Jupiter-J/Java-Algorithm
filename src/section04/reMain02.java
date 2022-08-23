package section04;

import java.util.HashMap;
import java.util.Scanner;

public class reMain02 {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (char y : str2.toCharArray()){
            if (!map.containsKey(y) || map.get(y)==0){
                return "NO";
            }
            map.put(y,map.get(y)-1);
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
