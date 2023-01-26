package 단어공부;

import java.util.Scanner;

//알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
//입력은 대문자를 입력하고 결과는 대소문자 구분하지않음 (AaAbcdd =>A)
//만약 가장 많이 등장하는 알파벳이 여러개인 경우는 ? 로 출력
//ddcfgrG => ?
//대문자로 출력
public class WordStudy {
    public static void main(String[] args) {

        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String str = sc.next();
        String str1 = str.toUpperCase();

        System.out.println(str1);
        int num =0;
        char ch= ' ';

        for(int i = 0; i < str1.length(); i++){
           for(int j = 0; j< str1.length(); j++){
               if(str1.charAt(i)==str1.charAt(j)){
                   System.out.println("i: "+str1.charAt(i));
                   System.out.println("j: "+str1.charAt(j));
                   num++;
                 ch=str1.charAt(i);
               }
           }
        }
        System.out.println(num);
        System.out.println(ch);



        //출력


    }
}
