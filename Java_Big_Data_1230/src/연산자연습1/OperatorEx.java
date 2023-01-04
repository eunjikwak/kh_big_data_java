package 연산자연습1;

import java.io.IOException;
import java.util.Scanner;

//이항연산자와 삼항연산자
//산술연산자 : +, -, *, / ,%(나머지)
//대입연산자 : 값을 변수에 대입할 때 사용 ,대입은 항상 뒤에서 일어남
//복합대입연산자 : 연산 후 대입
//증감연산자 : 값을 1증가하거나 1감소 시키는 연산자 (단항연산자) ++,--
//(우위와 전위에 따라 상황이 달라짐)
//비교연산자 : 값의 크기를 비교하는 연산자
//논리 연산자 : 참과 거짓을 판단하는 연산자 (AND (&&), OR(||), NOT(!)
//삼항 연산자 : 항이 3개인 연산자 (조건문)
//문자열 결합 연산자 : 문자열을 이어주는 연산자.
public class OperatorEx {
    public static void main(String[] args) {
        //========산술연산자 예제 ========
//        int num1 =10,num2 =2;
//        System.out.println("+연산자 : " +(num1+num2));
//        System.out.println("-연산자 : " +(num1-num2));
//        System.out.println("*연산자 : " +(num1*num2));
//        System.out.println("/연산자 : " +((double)num1/num2));
//        System.out.println("%연산자 : " +(num1%num2));

//        try {
//            System.out.println(num1 / num2);
//        }catch (ArithmeticException e){
//            System.out.println("값을 0으로 나누면 안됩니다.");
//        }
        //========복합대입 연산자 예제 ========
        //int num1 =10;
//        System.out.println(num1 += 2);
//        System.out.println(num1 -= 2);
//        System.out.println(num1 *= 2);//곱하기는 풀어쓰긴함
//        System.out.println(num1 /= 2);
//        System.out.println(num1 %= 2);
        //======증감연산자 예제 ==========
//        int num1 =10;
//        System.out.println(num1--);
//        System.out.println(num1);
        //========비교 연산자 예제 ========
//        int x = 10, y = 20;
//        System.out.println(x > y); //false
//        System.out.println(x < y); //true
//        System.out.println(x == y); // == 같다라는 의미, = 대입의 의미
//        System.out.printf("%B\n",x>=y); //false
//        System.out.println(x<=y); //true
        //========논리 연산자 예제 ========
//        int x = 10, y=20;
//        boolean rst1,rst2,rst3;
//        rst1 = (x>y) && (x>5); //false
//        rst2 = (x>y) || (x>5); //true
//        rst3 = !((x>y) || (x>5)); //false
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);

        //========삼항 연산자 예제 ========
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//        boolean isAdult = (age>19) ? true : false;
//
//        System.out.println(isAdult);

        //========문자열 결합 연산자 예제 ========
        System.out.println("Java"+11.03+12);

    }

}
