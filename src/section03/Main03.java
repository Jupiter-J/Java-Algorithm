package section03;

import java.util.Scanner;

public class Main03 {
    public static int solution(int n, int k,int []arr1){
     int sum = 0, answer;
     for (int i=0; i<k; i++) sum += arr1[i]; //1. k 만큼의 인덱스 합
     answer = sum;
     for (int i=k; i<n; i++){ //2. 뒤의 인덱스 더하고 앞의 인덱스 빼기
         sum += (arr1[i] - arr1[i-k]);
         answer = Math.max(answer, sum); //3. 값 비교
     }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print(solution(n, k, arr1));
    }
}
