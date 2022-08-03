package section02;

import java.util.Scanner;

public class Main03 {
    public static String solution(int n, int []arr1, int[]arr2){
        String answer = "";
        for (int i=0; i<n; i++){
            if (arr1[i]==arr2[i]){ //1. A가 비기는 경우
                answer += "D";
            }else if(arr1[i] ==1 && arr2[i]==3){ //2. A가 가위로 이기는 경우
                answer += "A";
            }else if(arr1[i] ==2 && arr2[i]==1){ //3. A가 바위로 이기는 경우
                answer += "A";
            }else if(arr1[i] ==3 && arr2[i]==2) { //4. A가 보로 이기는 경우
                answer += "A";
            }else answer += "B"; //5. 그외의 나머지는 전부 B

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        for (char x : solution(n , arr1, arr2).toCharArray())
        System.out.println(x);
    }
}
