package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("foddName : ");
        String name = scanner.nextLine();

        System.out.print("foodPrice : ");
        int price = scanner.nextInt();

        System.out.print("foodQuantity : ");
        int quan = scanner.nextInt();

        System.out.println("you ordered "+quan+" "+name+". and the total price is "+price*2);
    }
}
