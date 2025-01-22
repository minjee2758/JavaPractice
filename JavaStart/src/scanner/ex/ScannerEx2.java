package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input 1 int : ");
        int num = scanner.nextInt();

        if (num%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
