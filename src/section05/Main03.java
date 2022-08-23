package section05;

import java.util.Scanner;
import java.util.Stack;

public class Main03 {
    public static int solution(int [][]board, int []moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos: moves){
                            //행 크기
            for (int i=0; i<board.length; i++){
                        //행이 내려가고  인형이 발견되면
                if (board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    //찾은 자리는 0으로 변경
                    board[i][pos-1]=0;
                        //stack이 비어있지 않으면서 꺼낸 인형과 stack상단의 인형과 같은지 비교
                    if (!stack.isEmpty() && tmp == stack.peek()){
                        // 인형 두개를 터트림
                        answer +=2;
                        // 상단의 인형을 없애기
                        stack.pop();
                    }
                           // 다른 인형이면 그대로 집어 넣기
                    else stack.push(tmp);
                    break; //인형을 만났으면 멈춰줘야 함
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] board = new int[n][n];
        for (int i=0; i<n; i++ ){
            for (int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int [] moves = new int[m];
        for (int i=0; i<m; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board, moves));
    }
}
