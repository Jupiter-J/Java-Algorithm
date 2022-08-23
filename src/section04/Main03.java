package section04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main03 {
    public static ArrayList<Integer> solution(int n, int k, int []arr){
        ArrayList<Integer> answer = new ArrayList<>();
        //잘라진 구간에서의 map을 구해야함
        HashMap<Integer, Integer> map = new HashMap<>();
        // k-1일 까지 넣기
        for (int i=0; i<k-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // k부터 매출액 구하기
        int lt=0;
        for (int rt = k-1; rt<n; rt++){
            //이어서 집어넣기
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());

            //한칸씩 슬라이딩
            map.put(arr[lt], map.get(arr[lt])-1);
            if (map.get(arr[lt]) == 0)
                map.remove(arr[lt]);
            lt++;
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, k, arr))
        System.out.print(x + " ");
    }
}
