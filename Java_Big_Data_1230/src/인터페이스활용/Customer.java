package 인터페이스활용;

public class Customer implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() { // 디폴트 메소드가 다 없어지고 오버라이딩 해서 이름만 남음
        System.out.println("고객 주문");
    }


    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}
