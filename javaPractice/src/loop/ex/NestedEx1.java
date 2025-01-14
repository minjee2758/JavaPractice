package loop.ex;
//중첩 for문을 사용해서 구구단을 완성해라.
public class NestedEx1 {
    public static void main(String[] args) {
        for (int i=1; i<10 ; i++){
            for (int a = 1; a<10; a++){
                System.out.println(i + " * " + a + " = " +(a*i));
            }
        }
    }
}
