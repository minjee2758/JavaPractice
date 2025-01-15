package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("name : ");
            String name = scanner.nextLine();
            if (name.equals("exit")){
                break;
            }
            System.out.print("age : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println(name+", "+ age);

        }
    }
}
