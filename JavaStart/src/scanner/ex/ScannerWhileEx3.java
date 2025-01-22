package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int q = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1){
                break;
            }
            sum += num;
            q += 1;
        }
        double average = (double) sum/ q;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
