package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("first number : ");
            int num1 = scanner.nextInt();
            System.out.print("second number : ");
            int num2 = scanner.nextInt();

            if (num1==0 && num2==0) {
                break;
            } else {
                System.out.println("plus : " + (num1+num2));
            }
        }
    }
}
