package 십진수이진수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제 : 10진수가 주어지면 2진수로 변경하고 다시 2진수를 10진수로 변경합니다
//입력 : 10
//이진수 : 1010
//십진수 : 10
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s  ="";
        String num2 ="";
        int num10=0;
        while(true){
            int i = num % 2;
            num = num/2;
            s += i;
           if(num == 0) break;
        }
        for(int i = s.length()-1; i >= 0;i--){
            num2 +=s.charAt(i);
        }
        for(int i = 0; i<s.length(); i++)
        {
            num10 += (s.charAt(i)-'0') * (int)(Math.pow(2,i));;
        }
        System.out.println("2진법 : " + num2);
        System.out.println("10진법 : " + num10);


    }
}
