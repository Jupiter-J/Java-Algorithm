package section04;

import java.util.HashMap;
import java.util.Scanner;

public class Main02 {
    public static String solution(String str1, String str2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        //key 존재여부 확인
        for (char x : str2.toCharArray()){
            // key가 x 혹은 0을 가지고 있지 않으면
            if (!map.containsKey(x) || map.get(x)==0)
                return "NO";
            // 가지고 있다면 감소시켜서 이중확인
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.print(solution(str1, str2));
    }

}
