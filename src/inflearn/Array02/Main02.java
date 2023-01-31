package inflearn.Array02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {
    public int solution(int n, int []arr){
       ArrayList<Integer> answer = new ArrayList<>();
       int count = 1;
       answer.add(arr[0]);

       for (int i=1; i<n; i++){
           int maxSize = answer.size()-1;
          if (arr[i] > answer.get(maxSize)){
              answer.add(arr[i]);
              count++;
          }

       }
        return count;
    }
    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));

    }
}
