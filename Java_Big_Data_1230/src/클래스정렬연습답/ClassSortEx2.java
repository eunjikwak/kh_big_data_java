package 클래스정렬연습답;

import 클래스정렬연습문제.Student;

import java.util.Scanner;
import java.util.TreeSet;

public class ClassSortEx2 {
    public static void main(String[] args) {
        TreeSet<StudentInfo> ts = new TreeSet<>(new ScoreSort()); //정렬조건넣어줌
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        int cnt = 0;
        int preScore = 0;
        for(int i = 0; i < n ; i++){
            ts.add(new StudentInfo(sc.next(),sc.nextInt(),sc.nextLine()));

        }

        System.out.println("======= 학생 성적 출력 =======");
        System.out.println(" 석차   성적    이름    학번   ");
        System.out.println("----------------------------");
        for(StudentInfo e : ts){
            if(preScore != e.score) cnt++; //동점자 반영 하는것
            System.out.printf("%3d%7d%7s%9s\n",cnt,e.score,e.name,e.number);
            preScore =e.score;
        }
    }
}
// 동점자일때는 카운트를 증가 안시켜주면 원래 등수로 반영하면 동일 석차 구하는거 가능 ****
