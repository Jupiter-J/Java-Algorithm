package inflearn.section02;

import java.util.Scanner;

public class Main02 {
    //이중 for 문은 시간 초과
    public static int solution(int n, int []arr){
        int answer = 1; //첫번째 사람은 무조건 보인다
        int max = arr[0];

        for (int i=1; i<n; i++){
            if (arr[i]> max){  //키가 같아도 안보임
                answer ++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
