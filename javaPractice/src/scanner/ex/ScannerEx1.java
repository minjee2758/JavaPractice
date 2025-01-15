package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("your name : ");
        String name = scanner.nextLine();

        System.out.print("your age : ");
        int age = scanner.nextInt();

        System.out.println("your name is "+name+", and age is "+age);
    }
}
