package inflearn.section04;

import java.util.HashMap;
import java.util.Scanner;

public class Main04 {
    public static int solution(String n, String t){
        int answer = 0;
        HashMap<Character , Integer> amap = new HashMap<>();
        HashMap<Character , Integer> bmap = new HashMap<>();
        int L = t.length()-1;
        //비교군 t
        for (char x : t.toCharArray())amap.put(x,amap.getOrDefault(x,0)+1);
        //비교 대상 n
        for (int i=0; i<L; i++)
            bmap.put(n.charAt(i),bmap.getOrDefault(n.charAt(i),0)+1);
            int lt =0;
            for (int rt=L; rt<n.length(); rt++){
                bmap.put(n.charAt(rt), bmap.getOrDefault(n.charAt(rt),0)+1);
                if (bmap.equals(amap)) answer++;
                bmap.put(n.charAt(lt), bmap.get(n.charAt(lt))-1);
                if (bmap.get(n.charAt(lt))==0) bmap.remove(n.charAt(lt));
                lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t= sc.next();
        System.out.println(solution(s, t));
    }
}
