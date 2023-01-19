package inflearn.section04;


import java.util.HashMap;
import java.util.Scanner;

public class reMain01 {
    public static Character solution(int n, String str){
        char answer = ' ';
        int max=Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for (char key: map.keySet()){
            if (map.get(key) > max){
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
        System.out.println(solution(n, str));
    }
}
