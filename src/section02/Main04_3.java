package section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04_3 {
    public static ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(0,1);
        answer.add(1,1);
//        answer[0]=1;
//        answer[1]=1;

        for (int i=2; i<n; i++){
          //  answer.add(i)= answer.add(i-2) + answer.add(i-1);
        }return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : solution(n)){
            System.out.println(x + " ");
        }
    }
}
