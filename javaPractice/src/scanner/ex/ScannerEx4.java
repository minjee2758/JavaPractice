package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input number : ");
        int n = scanner.nextInt();
        for (int i=1; i<=9; i++) {
            System.out.println(n+" x "+i +" = "+n*i);
        }
    }
}
