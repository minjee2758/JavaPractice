package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("price? : ");
            int price = scanner.nextInt();
            if (price == -1 ){
                System.out.println("exit");
                break;
            }
            System.out.print("quantity? : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.println("total price : "+price*quantity);


        }

    }
}
