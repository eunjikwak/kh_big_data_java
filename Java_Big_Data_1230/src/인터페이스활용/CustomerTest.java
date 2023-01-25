package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order(); //재정의된 메소드가 호출 됨


        Sell seller = customer;
        seller.sell();
        seller.order();

        //디폴트 메소드가 중복될 때 자식이 오버라이딩 하면 덮어씌어져 재정의된 메소드가 호출된다.

    }
}
