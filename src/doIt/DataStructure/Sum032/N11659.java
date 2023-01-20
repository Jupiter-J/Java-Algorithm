package doIt.DataStructure.Sum032;

import java.util.Arrays;
import java.util.Scanner;

public class N11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int []A = new int[N+1];
        int []S = new int[N+1];
        for (int x=1; x<=N; x++){
            A[x] = sc.nextInt();
            S[x] = S[x-1] + A[x];
        }
        int answer =0;
        for (int x=0; x<M; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            answer = S[j] - S[i-1];
            System.out.println(answer);
        }
    }
}
