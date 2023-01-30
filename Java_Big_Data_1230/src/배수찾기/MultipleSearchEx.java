package 배수찾기;
// 문제 : 정수 n과 수의 목록이 주어졌을 때 , 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 줄에 n이 주어짐, 다음 줄에 한줄에 한개 씩 목록에 들어있는 수가 주어짐 (0 ~ 10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한후 아래처럼 출력
// 3 >> 정수 n의 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에대한 종료

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//출력
// 1 is Not a multiple of 3.
// 7 is Not a multiple of 3.
// 99 is a multiple of 3.
// 321  is a multiple of 3.
// 777 is a multiple of 3.
public class MultipleSearchEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); //ArrayList 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력: ");
        int n = sc.nextInt(); //주어진 수
        System.out.print("목록 입력: ");
        int val;
        while (true){ // 주어진 값의 배수인지 아닌지 판별하기 위한 값을 입력 받음
            val = sc.nextInt(); //키보드로 값을 받음
            if(val == 0) break;// 반복문 탈출 조건
            //add 에 인덱스를 지정하지 않으면 마지막 위치에 저장 됨
            list.add(val); // 원래는 int 형인데 박싱해줘서Integer 로 들어감 원래는 new Integer(val)가 맞음

        }
        for(Integer e : list){
           if(e % n == 0) System.out.println(e + " is a multiple of " + n + ".");
           else System.out.println(e + " is Not a multiple of " + n + ".");
        }

    }
}
