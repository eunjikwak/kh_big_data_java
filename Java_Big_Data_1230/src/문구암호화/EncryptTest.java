package 문구암호화;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EncryptTest {

    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine(); //평문은 공백 허용
        System.out.print("암호화키 : ");
        String encrypt = sc.next();
        //키배열
        char[] enc = encrypt.toCharArray(); //암호화 키를 문자 배열로 변경
        //값을 리스트
        List<Character> list = new ArrayList<>();
        //담을 값 변수
        char val = 0;
        for(int i = 0; i < normal.length(); i++){
            if(normal.charAt(i) == ' ') list.add(' ');
            else{
                val = (char) (normal.charAt(i) - (enc[i % enc.length]-'a')-1 ); //a 만큼 빼면 0이니까 1부터 시작하려면 더해야함
               if(val <'a') val+=26;
               list.add(val);
            }
        }
        //출력
        for(Character e : list) System.out.print(e);
    }
}
