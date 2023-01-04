package 조건문연습문제1;

import java.util.Scanner;

//성적을 입력 받음
// 입력받은 값이 0 ~ 100 사이가 아니면 "잘못 입력하였습니다." 출력
// 90점 이상이면 A , 80점 이상이면 B, 70점이상이면 C , 60점 이상이면 D, 나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
        //스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        //생성된 객체에서 입력 받음
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        //조건문에 값이 0과 100사이인 경우 해당 학점 출력

        //연습문제 1 (내가쓴답)
//        if(score<0 || score>100) {
//            System.out.println("잘못 입력 하였습니다.");
//        }else if(score>=90){
//            System.out.println("A");
//        }else if (score>=80){
//            System.out.println("B");
//        }else if (score>=70){
//            System.out.println("C");
//        }else if(score>=60){
//            System.out.println("D");
//        }else{
//            System.out.println("F");
//        }
//
        //연습문제 2 (정답1)
//        if(score>=0 && score<=100){
//
//            if(score>=90) System.out.println("A");
//            else if (score>=80) System.out.println("B");
//            else if (score>=70) System.out.println("C");
//            else if (score>=60) System.out.println("D");
//            else System.out.println("F");
//
//        }else{
//            System.out.println("잘못입력하였습니다.");
//        }

        //연습문제 3 (return 사용해서 구현)
        if(score > 100 || score < 0){
            System.out.println("잘못입력하셨습니다.");
            return;
        }
        if(score>=90) System.out.println("A");
        else if (score>=80) System.out.println("B");
        else if (score>=70) System.out.println("C");
        else if (score>=60) System.out.println("D");
        else System.out.println("F");




    }
}
