package doIt.DataStructure.Sum032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11659A {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 값을 분리
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        //숫자 데이터를 다룰 때는 long 이 낫다
        long[]S = new long[suNo +1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i=1; i<= suNo; i++){
        S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q =0; q < quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

    }
}
