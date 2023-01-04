package 입출력예제2;
//콘솔 입력

import java.io.IOException;
import java.util.Scanner;

//1.System.in.read() :키보드의 입력을 ASCII 코드값으로 읽어 들임.
//2.Scanner 입력 : 키보드의 입력을 원하는 데이터 타입으로 반환 받음. 두번째로 많이쓰이는 자바 API
public class ScannerEx {
    public static void main(String[] args)  {//throws IOException 예외가 발생하면 던져라
//        while (true) {//탈출조건이 필요함
//           try{
//               int keyCode = System.in.read();
//               System.out.println("KeyCode : " + keyCode);
//               if(keyCode == 'q')break;
//           } catch(IOException e){ //문제가 발생했던 경로를 찍어주는 구문
//               e.printStackTrace();
//           }
//        }
        Scanner sc = new Scanner(System.in);
        //static : 정적이다 main , heap : 메모리할당(클래스같은거) <<인스턴스화되있다
        //stack: 지역변수, 참조형 가르키는걸 포인터
        byte a = sc.nextByte(); //키보드입력을 byte형으로 반환
        short b = sc.nextShort(); //short로반환
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); //문자열을 입력받고 문자 1개(0-첫번째)추출
        String s1 = sc.next(); //문자열을 공백 단위로 입력 받음
        String s2 = sc.nextLine();// 문자열을 줄바꿈 기준으로 입력 받음

    }
}
