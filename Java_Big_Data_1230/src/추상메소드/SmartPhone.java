package 추상메소드;

public class SmartPhone extends Phone{
    SmartPhone(String name) { //부모 생성자에 매개변수가 있기때문에 슈퍼로 불러줌
        super(name); //부모 생성자 호출할대는 super
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 구현합니다.");
    }

    public void internet(){
        System.out.println("인터넷 기능을 만듭니다.");
    }

}
