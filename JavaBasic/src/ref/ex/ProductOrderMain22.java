package ref.ex;

import java.util.Scanner;

public class ProductOrderMain22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input the number of orders : ");
        int N = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[N];

        for (int i = 0; i<N; i++){
            System.out.println(i+1+"st order input ");
            System.out.print("name : ");
            String productName = scanner.nextLine();

            System.out.print("price : ");
            int price = scanner.nextInt();

            System.out.print("quantity : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrders(productName, price, quantity);
        }
        printOrders(orders);
        int total = totalAmount(orders);
        System.out.println(total);
    }
    static ProductOrder createOrders(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.ProductName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("name : " + order.ProductName + ", price : " + order.price + ", quantity : "+order.quantity);
        }
    }
    static int totalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price*order.quantity;
        }
        return total;
    }
}
