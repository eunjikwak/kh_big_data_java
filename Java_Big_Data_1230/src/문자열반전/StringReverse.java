package 문자열반전;

import java.util.Arrays;
import java.util.Scanner;

//abcdefg = > gfedcba
//힌트 for문 이용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str= sc.next();
        for(int i = str.length(); i > 0; i--){
            System.out.print(str.charAt(i-1));
        }
        System.out.println();

        int index = str.length();
        while (true){
            index--;
            System.out.print(str.charAt(index));
            if (index == 0) break;
        }

        System.out.println();
        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }




    }
}
