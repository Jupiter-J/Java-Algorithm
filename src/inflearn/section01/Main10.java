package inflearn.section01;

import java.util.Scanner;

public class Main10 {
    public static int[] solution(String str, char t){
    // 왼쪽으로부터 떨어진 거리
        int[] answer = new int[str.length()];
        int p=1000;
        for (int i=0; i< str.length(); i++){
            if (str.charAt(i)==t){
                p=0; //타겟 문자면 0을 저장
                answer[i]=p;
            }
            else{
                p++; //증가한 값을 저장
                answer[i]=p;
            }
        }
    // 오른쪽으로부터 떨어진 거리
    p=1000;
        for (int i= str.length()-1; i>=0; i--){
            if (str.charAt(i)==t)
                p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int x : solution(str, t)){
            System.out.print(x + " ");
        }
    }
}
