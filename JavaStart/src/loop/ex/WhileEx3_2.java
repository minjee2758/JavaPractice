package loop.ex;
//반복문을 사용하여 1부터 `max` 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요. 이때, `sum` 이라는 변수를
//용하여 누적 합을 표현하고, `i` 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.
public class WhileEx3_2 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 10;

        for (int i =0; i<=max; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
