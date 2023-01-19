package doIt.DataStructure.ArraynList031;

import java.util.Scanner;
public class N11720A {
    public static void main(String[] args) {

        //toCharArray를 사용해보기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();

        char [] addNum = num.toCharArray();
        int answer = 0;
        for (int i=0; i<addNum.length; i++){
           answer += addNum[i]-'0';
        }
        System.out.println(answer);

    }
}
