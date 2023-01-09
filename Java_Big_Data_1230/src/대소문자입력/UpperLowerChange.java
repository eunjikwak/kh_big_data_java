package 대소문자입력;

import java.util.Scanner;

//영문자 소문자와 대문자로 이루어진 단어를 입력받은 뒤 대문자는 소문자로 , 소문자는 대문자로 변경
//무조건 입력은 영문자이다.
//AbCdEf =>aBcDeF
// 힌트 1 : 문자열에서 문자를 추출하는 메소드는 charAt(인덱스)
// 힌트 2 : 자바에서의 문자는 정수값을 사용된다.
// 힌트 3 : 정수값으로 계산한 후 출력 시 (char)형 변환이 필요하다
//a :97 z:122 A :65 Z : 90
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자입력 : ");
        String a = sc.nextLine();
        String result ="";
        for(int i = 0; i < a.length(); i++){
            if((int)a.charAt(i) > 64 && (int)a.charAt(i) <91){
                result +=(char)((int)a.charAt(i)+32);
            }else {
                result +=(char)((int)a.charAt(i)-32);
            }
        }
        System.out.println(result);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.next();
//        char ch;
//        for(int i = 0; i < str.length(); i++){
//            ch = str.charAt(i);
//            if(ch <'a') System.out.print((char)(ch +('a'-'A')));
//            else System.out.print((char)(ch-('a'-'A')));
//        }





    }
}
