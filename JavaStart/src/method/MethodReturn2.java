package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(18);

    }
    public static void checkAge(int age){
        if (age <18) {
            System.out.println("미성년자입니다.");
            return;
        }
        System.out.println("입장하세요");
    }
}
