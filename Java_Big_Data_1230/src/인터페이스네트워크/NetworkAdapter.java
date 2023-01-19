package 인터페이스네트워크;
// 인터페이스란? 완전 추상화 개념으로 인터페이스에 포함된 메소드는 일반적으로 전부 추상 메소드이다.
// 메소드를 선언하면 추가 여부에 상관없이 public abstract 키워드로 동작
// 인터페이스 상속의 키워드는 implements
public interface NetworkAdapter {
    void connect(); //public abstract 가 자동으로 붙음
}

class Wifi implements NetworkAdapter{
    String company;
    Wifi(String company){
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "의 Wifi 에 연결되었습니다.");
    }
}

class FiveG implements NetworkAdapter{
    String company;
   public FiveG(String company){
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 5G 에 연결되었습니다.");
    }
}

class LTE implements NetworkAdapter{
    String company;
    @Override
    public void connect() {
        System.out.println(company + "의 LTE 에 연결되었습니다.");
    }
    public LTE(String company) {
        this.company = company;
    }
}
