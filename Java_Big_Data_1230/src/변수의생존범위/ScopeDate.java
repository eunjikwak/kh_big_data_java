package 변수의생존범위;

import java.util.Scanner; // 선언을 안하고하면 앞에 java.util.Scanner로 계속 써야함

// 상수란? 변수와 마찬가지로 데이터를 저장하는 메모리공간
// 변수와 다른점은 프로그램이 실행되는 동안 값이 변하지않음
// 자바에서 상수는 final 키워드로 정의하고 단 한번만 값을 넣을 수 있음.(시점은 아무때나 자바만)
// 상수는  다 대문자로 씀
public class ScopeDate {
    public static void main(String[] args) {
       final double taxRate = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 수입을 입력하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은 " + income *taxRate);

    }
}
