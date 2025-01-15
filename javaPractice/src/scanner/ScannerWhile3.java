package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;

        while (true) {
            System.out.print("input number : ");
            int num = scanner.nextInt();
            sum += num;

            if (num==0) {
                System.out.println(sum);
                break;
            }
        }
    }
}
