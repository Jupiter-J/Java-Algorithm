package section03;

import java.util.*;
public class Main01 {
    public static ArrayList<Integer>solution( int []arr1, int []arr2) {
      ArrayList <Integer> answer = new ArrayList<Integer>();

        // 두 배열을 합치기
        for (int x : arr1){
            answer.add(x);
        }
        for (int x : arr2){
            answer.add(x);
        }
        Collections.sort(answer);
      //  Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int []arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(arr1, arr2)){
            System.out.print(x + " ");
        }
    }
}
