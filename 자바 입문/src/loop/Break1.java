package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        //**문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?**
        //1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
        while (true) {
            sum += i;
            if (sum>10) {
                System.out.println(i);
                break;
            } else {
                i+=1;
            }
        }
    }
}
