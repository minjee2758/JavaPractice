package loop.ex;
//반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, `num` 이라는 변수를 사용하여 수를 표현해야 합니다.
public class WhileEx2_1 {
    public static void main(String[] args) {
        int num = 2;
        while (num<=20){
            System.out.println(num);
            num+=2;
        }
    }
}
