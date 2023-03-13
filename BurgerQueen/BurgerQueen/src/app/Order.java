package app;

public class Order {
    private Cart cart;

    public Order(Cart cart){
        this.cart = cart;
    }
    public void makeOrder(){

        int totalPrice = cart.calculateTotalPrice();

        System.out.println("주문이 완료되었습니다.");
        System.out.println("주문 내역은 다음과 같습니다.");
        System.out.println("-".repeat(60));

        //상품 상세 내역 출력
        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("금액 합계       :%d원\n", totalPrice);
    }
}
