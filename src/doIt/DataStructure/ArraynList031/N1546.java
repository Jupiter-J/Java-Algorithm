package doIt.DataStructure.ArraynList031;

import java.util.Arrays;
import java.util.Scanner;

public class N1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []result = new int[n];
        for (int i=0; i<n; i++){
            result[i] = sc.nextInt();
        }
        Arrays.sort(result);

        int maxNum = result[result.length-1]; //최댓값
        int addNum = 0; //합
        double answer = 0; //정답
        for (int x : result){
            addNum += x;
        }

        answer = addNum*100/(double)maxNum/n;
        System.out.println(answer);

    }
}
