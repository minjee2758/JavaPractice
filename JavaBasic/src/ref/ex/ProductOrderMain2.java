package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];

        order[0] = createOrder("a", 10000, 3);
        order[1] = createOrder("b", 7000, 10);
        order[2] = createOrder("c", 9000, 2);

        printOrders(order);
        int total = getTotalAmount(order);
        System.out.println(total);

    }
    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder orders = new ProductOrder();
        orders.ProductName = name;
        orders.price = price;
        orders.quantity = quantity;
        return orders;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println(order.ProductName + " " + order.price +", " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount=0;
        for (ProductOrder order : orders) {
            totalAmount += order.price *order.quantity;
        }
        return totalAmount;
    }
}
