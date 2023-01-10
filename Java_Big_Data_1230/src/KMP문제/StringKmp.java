package KMP문제;

import java.util.Arrays;
import java.util.Scanner;

//입력 : Knuth-Morris-Pratt
//출력 : KMP
//입력 : Mirko-Slavko
//출력 :MS
public class StringKmp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String str =sc.next();

//        //1.split()
//        String[] splitStr = str.split("-");
//        //출력
//        for(String e : splitStr) System.out.print(e.charAt(0));

//        //2.대문자만 골라내기
//        for(int i = 0 ; i <str.length(); i++){
//          if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') System.out.print(str.charAt(i));
//        }

//        //3.0번째 문자 출력, 그리고 '-' 다음 문자 출력
//        for(int i = 0; i < str.length(); i++){
//            if(i == 0) System.out.print(str.charAt(i));
//            else {
//                if(str.charAt(i) == '-') System.out.print(str.charAt(i+1));
//            }
//        }

        //4. 문자배열로 변경후 대문자 골라내기
        char[] chStr = str.toCharArray(); //문자열을 문자배열로 바꿈
        for(char e : chStr){
            if(e >='A' && e <='Z')System.out.print(e);
        }


    }
}
