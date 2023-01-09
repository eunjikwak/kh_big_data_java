package 문자열다루기;

import java.util.Arrays;

public class StringType {
    public static void main(String[] args) {
        System.out.println("======equals======");
        //equals 메소드 : 두개의 문자열이 동일한지 비교하여 결과값을 리턴
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b));// a의 문자열과 b의 문자열 비교
        System.out.println(a.equals(c)); // a와 c를 비교
        System.out.println(a.equalsIgnoreCase("HELLO"));//대소문자무시
        System.out.println(a == c);//문자열의 내용비교X , 문자열의 참조 ,즉 주소 비교
        System.out.println("======indexOf======");
        // indexOf : 문자열엥 특정 문자 혹은 문자열이 시작되는 인덱스값 리턴
        String d = "Hello J Jav Java";
        System.out.println(d.indexOf("J"));
        System.out.println("======contains======");
        // contains : 문자열에서 특정문자열을 포함여부를 리턴(true,false)
        System.out.println(d.contains("Hello")); //대소문자 구분함
        System.out.println("======charAt======");
        //charAt : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(d.charAt(1));
        System.out.println("======replaceAll======");
        //replaceAll : 문자열 중 특정 문자열을 다른 문자로 대체할 때 사용
        String language = "Java, Python, C, C++, JavaScript, Kotlin, Swift";
        System.out.println(language.replaceAll("Kotlin","Jet Brain"));
        System.out.println(language.replaceAll("JavaScript",""));
        System.out.println("=======substring=====");
        // substring : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(6));// 시작 인덱스부터 끝까지 추출
        System.out.println(e.substring(1,4)); //시작 인덱스부터 종료 인덱스 미만까지 추출
        System.out.println("======대소문자======");
        //toUpperCase/ toLowerCase : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        System.out.println("======trim======");
        //trim : 문자열의 앞 뒤에 있는 공백 제거 (중간은 안지워짐)
        String str = "     자바 프로그래밍    ! !  ! ! !    ";
        System.out.println(str.trim());
        //문자열 포매팅이란 ? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해 서식이필요)
        System.out.printf("자바 프로그램을 %s 공부합시다.\n","열심히");
        String newStr = "";
        int number = 10;
        String day = "three";
        newStr = String.format("I ate %d apples. so I was sick for %s days",number,day);
        System.out.println(newStr);
        System.out.println("======toCharArray======");
        //toCharArray() : 문자열을 문자 배열로 변환
        String name ="곰돌이사육사";
        char[] arrName = name.toCharArray();
        System.out.println(name);
        System.out.println(Arrays.toString(arrName));
    }
}
