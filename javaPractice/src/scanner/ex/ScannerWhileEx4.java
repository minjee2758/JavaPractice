package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;

        while (true) {
            int option = scanner.nextInt();

            if (option==1){
                System.out.print("name? : ");
                String name = scanner.nextLine();
                scanner.nextLine();

                System.out.print("price : ");
                int price = scanner.nextInt();
                scanner.nextLine();

                System.out.print("quantity : ");
                int quantity = scanner.nextInt();

                System.out.println("name : "+name+", price : "+price+", total : "+price*quantity);

                sum += price*quantity;
            } else if (option ==2) {
                System.out.println("total price : " + sum);
                sum = 0;

            }else {
                System.out.println("exit");
                break;
            }
        }
    }
}
