package inflearn.String01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        str = str.toUpperCase();
        char [] world = str.toCharArray();
        c = Character.toUpperCase(c);

        int answer =0;
        for (int i=0; i<world.length; i++){
            if (world[i] == c){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
