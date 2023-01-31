package inflearn.Array02;

import java.util.Scanner;

public class reMain05 {
    public int solution(int n){
        int answer = 0;
        int [] ch = new int[n+1]; //인덱스 번호가 n번까지 이기 때문
        for (int i=2; i<=n; i++){
            if(ch[i] == 0){
                answer++;
                for (int j=i; j<=n; j=j+i)
                    ch[j]=1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        reMain05 T = new reMain05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
