package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        int num1, num2; //같은 타입으로 여러개의 변수를 선언 콤마(,)로구분
        double num3 = 3.14; //실수 타입 변수를 선언과 동시에 초기화
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시 " + minute +"분");

        NameCard nameCard = new NameCard();
        nameCard.name = "곰돌이사육사";
        nameCard.age= 30;
        nameCard.address = "서울시 강서구";
        nameCard.eMail = "eje11@navr.com";
        nameCard.phoneNumber = "010-0000-0000";

        System.out.println(nameCard.name);
    }
}

//사용자 정의 자료형
class NameCard {
    String name;
    int age;
    String address;
    String eMail;
    String phoneNumber;

}
