package 최소값최대값구하기;

import java.util.Arrays;
import java.util.Scanner;

// 정수 값 입력
// 입력된 정수 범위에 임의의 값 입력
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1 3 5 7 2 4 10 10 20 15
// MIN = 1
// MAX = 20
public class MinMaxArray {
    public static void main(String[] args) {
        //키보드 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 정수값 입력을 받음
        System.out.print("배열 개수 입력 : ");
        int arrNum = sc.nextInt();
        // 입력 받은 변수의 크기만큼 배열을 생성
        int[] arr = new int[arrNum];

        // 생성된 배열 크기 만큼 순화하면서 정수값을 입력 받음
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //값을 비교하기 위해 기준 값이 필요한데 0번째 값을 기준값으로 저장
        int min = arr[0], max = arr[0];
        // 배열에서 제일 작은 값과 제일 큰값을 찾음
       for(int e : arr){
           if(min > e) min = e;
           if(max < e) min = e;
       }

        // 출력
        System.out.println(Arrays.toString(arr));
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : "+ max);
    }


}
