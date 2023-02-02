package 숫자포함;

import java.util.Arrays;
import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여있음, 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 70000000
// 출력 : 7
// 입력 : 5678
// 출력 : 26
// 입력 : 0000
// 프로그램종료
public class NumberSumEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int sum = 0; //한번 계산 결과를 출력후 초기화 되어야함
            System.out.print("입력 : ");
            String str = sc.next();
            if(str.equals("0000")) {
                System.out.println("프로그램종료");
                return;
            }
            for(int i = 0; i< str.length(); i++){
                sum +=str.charAt(i)-'0';
            }
           System.out.println("출력 : " + sum);

        }
    }
}
