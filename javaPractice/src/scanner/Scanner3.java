package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 하나 입력해봐요 : ");
        int num1 = scanner.nextInt();

        System.out.print("정수 하나 더 입력해봐요 : ");
        int num2 = scanner.nextInt();

        if (num1==num2) {
            System.out.println("=");
        } else if (num1>num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
