package 정적메소드;
import static 정적메소드.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinHan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 0);
        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); // getCount() 메소드는 static 정적 메소드이며 클래스 소속


        System.out.println("현재시간을 출력합니다.");
        System.out.println(Util.getCurrentDate("yyyy년MM월dd일-hh:mm:ss"));
        //클래스 생성하지 않고 Util 클래스 안에서 바로 호출할 수 있음(static 으로 지정)

        System.out.println("도메인 주소 : " + DOMAIN);
    }
}
