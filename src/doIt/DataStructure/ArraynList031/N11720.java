package doIt.DataStructure.ArraynList031;

import java.util.Scanner; //charAt
public class N11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //5
        String num = sc.next(); //12345

        //배열에 저장하기
        char [] addNum = new char[N];
        int answer =0;
        for (int i=0; i<N; i++){
            addNum[i] = num.charAt(i);
            answer += addNum[i]-'0';
        }
        System.out.println(answer);
    }
}
