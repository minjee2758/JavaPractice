package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        out(3, "hello world");
        out(5,"5");
        out(7,"7");
    }
    public static void out(int a, String message){
        for (int i=0; i<a; i++){
            System.out.println(message);
        }
    }
}
