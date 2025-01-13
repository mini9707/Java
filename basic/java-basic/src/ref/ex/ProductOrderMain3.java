package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int amount = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[amount];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = new ProductOrder(productName, price, quantity);
        }
        
        printOrder(orders);
        int totalPrice = getTotalPrice(orders);
        System.out.println("총 결제 금액 : " + totalPrice);
        
    }
    
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder(productName, price, quantity);
        return order;        
    }
    
    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }        
    }
    
    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
