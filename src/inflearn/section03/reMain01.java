package inflearn.section03;

import java.util.*;
class reMain01 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0; //포인터
        while(p1<n && p2<m){ //둘중 하나라도 거짓이되면 전체 거짓 => 멈춘다
            if(a[p1]<b[p2]) answer.add(a[p1++]); //p1값을 넣고 그후에 증가++
            else answer.add(b[p2++]); //p2값을 넣고 그후에 증가++
        }
        //남은 값을 집어 넣어야 하기 때문에 둘다 사용
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : solution(n, m, a, b))
            System.out.print(x+" ");
    }
}