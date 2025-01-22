package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println(average(1,2,3));

        System.out.println(average(15,25,35));

    }
    public static double average(int a, int b, int c){
        int sum = a+b+c;
        System.out.print("평균값: " );
        return sum/3.0;
    }
}
