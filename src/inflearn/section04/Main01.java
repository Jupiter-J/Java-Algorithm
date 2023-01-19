package inflearn.section04;

import java.util.HashMap;
import java.util.Scanner;

public class Main01 {
    public static char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()){
                                            //값이 없으면 vlaue에 +1 증가
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
                        //map 탐색
        for (char key : map.keySet()){
           // System.out.print(x+" "+ map.get(x));
           if (map.get(key)>max){
               max = map.get(key);
               answer = key;
           }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(solution(n, str));
    }
}
