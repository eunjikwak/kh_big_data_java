package 클래스정렬연습문제;
// 학생의 수를 입력받기
// 학생의 수만큼의 객체를 생성하여 정보를 입력 (이름 성적 학번)
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번 순으로 정렬
// 그리고 출력시 등수가 표기 되도록 할것

// 입력예시
//학생수 입력 : 3
// 안유진 99 202301
// 정국 87 202302
// 채연 88 202303

import java.util.Scanner;
import java.util.TreeSet;

//출력예시
// 학생 성적 출력
//---------------
//석차  성적   이름   학번
// 1    99  안유진 202301
public class ClassSortEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("학생수 입력 : ");
        int n = sc.nextInt();
        TreeSet<Student> ts = new TreeSet<>();
        for(int i =0; i<n; i++){
            String name = sc.next();
            int score = sc.nextInt();
            String id = sc.next();
            ts.add(new Student(name,score,id));
        }



        System.out.println("======= 학생 성적 출력 =======");
        System.out.println("석차  성적    이름    학번   ");
        System.out.println("---------------------------");
        int num=0;
        for(Student s : ts) {
            num++;

            System.out.println(" "+ num +"    " + s.score + "    " + s.name + "    " + s.id +"   ");
        }







    }
}
