package 문자열연결;
// 문자열 추가하기
// 첫번재 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 개수 만큼 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
// 2일때 결과값 : ulkorea
// 3일때 결과값 : oulkorea
// 힌트1. substring(index) : 문자열의 시작위치 부터 끝까지 잘라냄
// 힌트2. substring 메소드를 이용해 문자열을 추출하기 전에 index 계산이 필요함

import java.util.Scanner;

public class StringAppend {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 :");
        String str1 = sc.next();
        System.out.print("두번째 문자열 : ");
        String str2 = sc.next();
        System.out.print("정수값 입력 : ");
        int num = sc.nextInt();
        //연산
        int index = str1.length() - num;
        //출력
        System.out.println(str1.substring(index) + str2);

    }
}
