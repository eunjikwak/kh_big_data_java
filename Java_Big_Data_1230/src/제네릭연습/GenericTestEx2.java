package 제네릭연습;
//제네릭 타입 : 타입변수를 사용해 다형성 구현 (?)
public class GenericTestEx2 {
    public static void main(String[] args) {

        Person<String> p1 = new Person<>("곰돌이사육사");
        System.out.println(p1.info);

        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p2.info);



    }
}
//<T> 타입변수라고 하며, 임의의 참조 타입을 의미, 'T' 변수명을 의미 하며 아무 이름으로 지어도됨(일반적으로 T)

class Person <T>{
    public T info;
    Person(T info){
        this.info = info;
    }

}
