package doIt.DataStructure.Sum032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11659R {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 풀기
        InputStream inputStream = System.in;
        InputStreamReader sr = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(sr);


        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long []S = new long[N+1];
        st = new StringTokenizer(br.readLine());

        for (int i=1; i<= N; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        long answer =0;
        for (int q =0; q< N; q++){
            st = new StringTokenizer(br.readLine());
            int i= Integer.parseInt(st.nextToken());
            int j= Integer.parseInt(st.nextToken());
            answer = S[j] - S[i-1];
            System.out.println(answer);
        }

    }
}
