package inflearn.section02;

import java.util.Scanner;

public class Main11 {
    public static int solution(int n, int [][]arr){
        int answer = 0, max=Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            int cnt=0;
            for (int j=1; j<=n; j++){ //학생이 1부터 시작함으로 n을 포함시키기 위하여  n+1
                for (int k=1; k<=5; k++){ //  i가 1 증가할때 j는 전체 순회 {i번 학생과 같은 반인 j번 학생을 찾는다}
                    if (arr[i][k]==arr[j][k]){ //k는 학년 {i번 학생과 j번 학생의 학년이 같은지 확인}
                            cnt++;
                            break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n+1][6]; //1번부터 사용하기위해 n+1, 1학년~5학년을 위해서 6
        for (int i=1; i<=n; i++){ // i:학생번호
            for (int j=1; j<=5; j++){ // j:학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
