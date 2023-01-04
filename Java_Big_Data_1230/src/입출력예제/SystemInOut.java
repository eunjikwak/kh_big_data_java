package 입출력예제;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 수원시 ";
        char gender = '남';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;

        //자바 스타일 (메소드 오버로딩 하는 방식 )
        System.out.println("======Java Style Output ======");
        System.out.print("Name : " + name + "\n"); //줄바꿈문자
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));//연산자 우선순위때매 ()넣어줌
        System.out.println("평균 : " + ((double)(kor + eng + mat)/3));

        //C언어 스타일 (서식 지정자를 사용 printf)
        //서식지정자 : %d(정수), %ld(long) , %u(정수:부호무시), %f(실수), %.2f(소수점2자리까지),
        // %s(문자열), %c(char), %%(실제 %쓸때 ) , %b (논리형 데이터에 사용)
        //이스케이프 시퀀스 : \n(줄바꿈), \r(커서맨앞 CR), \t(탭), \b(백스페이스), \\(\쓰고싶을떄)
        System.out.printf("======  C Style Output ======\n");
        System.out.printf("이름 : %s, 주소 : %s \n",name,addr);//1:1 매핑관계

        System.out.printf("성별 : %c \n",gender);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("총점 : %d\n", kor+eng+mat);
        System.out.printf("평균 : %.2f\n", (double)(kor+eng+mat)/3);
        //System.out.printf("test : %B",0);

        System.out.print("Apple\rBanana\tKiwi\b\b\n");
        System.out.println("\"Enter\"키를 입력 하시면 종료 됩니다.");
        System.out.println("Hello\\Java");

        System.out.printf("오늘의 습도는 %d%%\n",25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n*n; i++){
            System.out.printf("%4d",i);
            if(i%n==0) System.out.println();
        }


    }
}
