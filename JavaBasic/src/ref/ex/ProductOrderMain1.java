package ref.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("first", 10000, 10);
        orders[1] = createOrder("second", 20000, 20);
        orders[2] = createOrder("third", 30000, 30);

        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println(total);
    }
    static ProductOrder createOrder(String name, int price, int quantitiy){
        ProductOrder order = new ProductOrder();
        order.ProductName = name;
        order.price = price;
        order.quantity = quantitiy;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println(order.ProductName + ", " + order.price + ", " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price;
        }
        return sum;
    }
}
