package inflearn.section05;

import java.util.*;

class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class Main08 {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        // Person 형 객체를 저장 할 수 있는 Queue
        Queue<Person> Q = new LinkedList<>();
        for (int i=0; i<n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()){
            //한명 꺼내기
            Person tmp = Q.poll();
            for (Person x : Q){
                if (x.priority > tmp.priority){
                    Q.offer(tmp);
                    tmp =null;
                    break;
                }
            }
            if (tmp!=null){
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
       // Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
