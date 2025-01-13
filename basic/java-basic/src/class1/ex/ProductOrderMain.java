package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        int totalPrice = 0;

        ProductOrder order1 = new ProductOrder("두부", 2000, 2);
        ProductOrder order2 = new ProductOrder("김치", 5000, 1);
        ProductOrder order3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] orderArray = new ProductOrder[] {order1, order2, order3};

        for (ProductOrder order : orderArray) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            totalPrice += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }
}
