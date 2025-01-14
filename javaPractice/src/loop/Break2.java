package loop;
//**문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.**
public class Break2 {
    public static void main(String[] args) {
        int i = 1;

        while (i<=5) {
            if (i==3) {
                i+=1;
                continue;
            }else {
                System.out.println(i);
                i+=1;
            }
        }
    }
}
