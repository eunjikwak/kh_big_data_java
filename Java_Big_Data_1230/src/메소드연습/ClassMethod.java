package 메소드연습;

import java.util.Scanner;

//메소드 이름 규칙 : 변수 만드는 규칙과 동일 (대/소문자, _,&,숫자 사용가능(숫자가 맨앞은안됌))
//camel 카멜표기법 사용
//접근제한자 반환타입 메소드이름(매개변수목록){  구현부; return  }
public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample(); //생성자 호출 시 전달하는 매개변수가 없음.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sample.sum(n1,n2); //sum 은 매개변수와 반환값이 있는 메소드
        System.out.println(rst);
        sample.say(); //say() 메소드를 호출하기 위해서는 클래스를 객체로 만들고 객체의 메소드로 접근
        System.out.println(sample.sayStr());


        int rst2 = sample.sum(1,2,3,4,5);
        System.out.println(rst2);
    }

}


