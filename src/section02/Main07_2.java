package section02;

import java.util.Scanner;

public class Main07_2 {
    public static void main(String[] args) {
        int score = 0;
        int finalscore = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] result = new int[n];
        int [] answer= new int[n];

        for (int i=0; i<n; i++){
            result[i] = sc.nextInt();
           // System.out.print( result[i] + " ");

            if (result[i] == 1){
                score++;
                System.out.println(score);
                answer[i] = score;
            }else {
                score = 0;
                answer[i] = score;
            }

        }


        for (int x : answer){
            System.out.print( x + " ");
            finalscore += x;

        }
        System.out.println("ㄴ정답"+ finalscore);
    }
}
