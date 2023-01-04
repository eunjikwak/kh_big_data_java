package 타입변환;
// 타입변환 : 하나의 타입을 다른 타입으로 변경 하는 것
// 1. 묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해주는 것
// 2. 명시적 형번환 : 개발자가 의도한대로 형변환을 하는 것.
// 3. 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수타입으로 변경
//                         Double.parseDouble(); : 문자열을 실수타입으로 변경
// 진수 표현 : 16진수 , 10진수, 9진수, 2진수
public class TypeEx1 {
    public static void main(String[] args) {
//        int num1 = 1,num2 = 4;
//        double rst1 = num1 / num2; //문제 발생하는 코드
//        double rst2 = (double)num1/num2; //두개형이 다르지만 컴파일러가 하나를 실수로 변경해줘서 묵시적으로 바꿔줌
//        double rst3 = 100+100.1;
//        System.out.println(rst1);
//        System.out.println(rst2);
//
//        String phoneNumber = "3.14316";
//        String name = "곰돌이사육사";
//
//        Double number = Double.parseDouble(phoneNumber);
//        System.out.println(number);

        //진수의 표현방법
        int var1 = 0b1010; //2진수 0b
        int var2 = 0267; //8진수 0
        int var3 = 399; //10진수
        int var4 = 0x100abd; //16진수 0x
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

     //오버로딩 : 다만들어놓고 형에 따라서 구분되서 받아지는 것

    }
}
