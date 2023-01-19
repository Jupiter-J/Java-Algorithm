package inflearn.section04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class reMain03 {
    public static ArrayList<Integer> solution(int n, int k, int []str){
      ArrayList<Integer> answer = new ArrayList<>();
      HashMap<Integer, Integer> map = new HashMap<>();
      //슬라이딩
                    //0,1,2까지만 = 3일째
      for (int i=0; i<k-1; i++){
        map.put(str[i], map.getOrDefault(str[i],0)+1);
      }
      //key의 갯수를 출력
      int lt=0;
                //k일째 = 4일째
      for (int rt=k-1; rt<n; rt++){
          map.put(str[rt], map.getOrDefault(str[rt], 0)+1);
          answer.add(map.size());
          map.put(str[lt], map.get(str[lt])-1);

          //0이 된 애는 무조건 제거를 해서  aswer.add의 값을 방해하지 않도록 해야함
          if (map.get(str[lt])==0)
              map.remove(str[lt]);
          lt++;
      }
      return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []str = new int[n];
        for (int i=0; i<n; i++){
            str[i] = sc.nextInt();
        }
        for (int x : solution(n, k, str)){
            System.out.print(x + " ");
        }
    }
}
