package 클래스기본;
//클래스이름 참조변수 = new 클래스이름();
public class BasicClass {

    public static void main(String[] args) {
        Car gv80 = new Car("GV80","White","2023.01",230); //클래스로 객체 생성
        Car santafe = new Car("Santafe","Gray","2023.01",210); //클래스로 객체 생성
        Car kona = new Car("Kona","Yello","2023.01",190); //클래스로 객체 생성
        gv80.setName("GV80 Sports");
        gv80.viewCar();
        santafe.setColor("Pink");
        santafe.viewCar();
        kona.viewCar();



    }
}

//접근제한자 : default 인 클래스 생성 (동일한 패키지에서 접근 가능)
class Car{
    static String manufacture =  "현대자동차"; //클래스 변수 (넓은 의미 - 필드) /클래스에 붙어다님
    private String name; //인스턴스 필드 (클래스가 객체로 만들어 질 때 객체의 개수만큼 생성됨)
    String color; // 인스턴스 필드
    String productYear;
    int maxSpeed;
    // 생성자 : 클래스 이름과 동일, 반환 타입이 없다.void 도 안붙음
    // 생성자는 주로 개체 생성시 객체 내부의 필드를 초기화 하는 목적으로 사용된다.
    // 필드는 생성자의 매개 변수로 전달된다. (객체를 생성하는 곳에서)
    Car(String name, String color, String year, int speed){
        this.name = name; // 전달받은 매개 변수와 객체 내부의 필드의 이름이 같은 경우는 숨겨진 this 를 적어야함
        this.color = color;
        productYear = year;
        this.maxSpeed = speed;
    }
    Car(){}
    //Setter 메소드 : 인스턴스의 값을 설정하는 메소드
    void setName(String name){
        this.name = name;
    }

    void setColor(String color){
        String test = "test";
        this.color = color + test;
    }

    void viewCar(){
        System.out.println("제조사 : " + manufacture);
        System.out.println("이름 : " + name);
        System.out.println("출고연도 : " + productYear);
        System.out.println("최고 속도 : " + maxSpeed);
        System.out.println("컬러 : " + color);
        System.out.println("--------------------");


    }


}