package loop;
//**문제: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)**
public class For2 {
    public static void main(String[] args) {
        int endNum = 3;
        int sum = 0;

        for (int i=1; i<=endNum; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
