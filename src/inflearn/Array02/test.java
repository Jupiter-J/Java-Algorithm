package inflearn.Array02;

public class test {

    public static void main(String[] args) {
        int answer = 0;
        int []arr = {1,0,1,0,0,0,1,1,1};
        int haha = 0;

        for (int i=0; i<5; i++){
            if (arr[i] == 1){
                System.out.println("1 입니다 : " + answer++);
            }else
                System.out.println("0 입니다 : " + haha++);

        }

        System.out.println(answer);
    }
}
