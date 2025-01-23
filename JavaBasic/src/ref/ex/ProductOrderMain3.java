package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input order number : ");
        int number = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[number];

        for (int i=0; i<number;i++){
            System.out.println("input "+(i+1) + "st order information");
            System.out.print("product name : ");
            String name = scanner.nextLine();
            scanner.nextLine();

            System.out.print("product price : ");
            int price = scanner.nextInt();

            System.out.println("product quantity : ");
            int quantity = scanner.nextInt();

            orders[i] = inputOrders(name, price, quantity);
        }
        printOrder(orders);
        int totalPrice = totalPrice(orders);
        System.out.println(totalPrice);

    }
    static ProductOrder inputOrders(String name, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.ProductName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("name : " + order.ProductName + ", price: " + order.price +", quantity : " + order.quantity);
        }
    }
    static int totalPrice(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price + order.quantity;
        }
        return total;
    }
}

