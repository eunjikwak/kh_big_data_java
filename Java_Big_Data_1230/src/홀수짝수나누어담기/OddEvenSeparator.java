package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//7개의 정수를 입력 받음 (배열 생성필요)
//정수입력 : 1 2 3 4 5 6 7
//홀 수 : 1 3 5 7
//짝 수 : 2 4 6
public class OddEvenSeparator {
    int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int oddNum = 0;
    int evenNum = 0;
    //7개의 정수를 입력 받음
    void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        for(int i = 0 ; i < inputArr.length; i++){
            inputArr[i] = sc.nextInt();
        }
    }
    //홀수 짝수 나눠담는 메소드
    void separatorArray() {

        for(int e : inputArr){
            if(e % 2 == 1) oddArr[oddNum++] = e;
            else evenArr[evenNum++] = e;
        }

//        for(int i = 0 ; i < inputArr.length; i++){
//            if(inputArr[i] % 2 == 1){
//                oddArr[oddNum] = inputArr[i];
//                oddNum++;
//            }else{
//                evenArr[evenNum] =inputArr[i];
//                evenNum++;
//            }
//        }

    }
    //홀수 / 짝수 배열 출력
    void printArray(){

        System.out.print("홀수 : ");
        for(int i = 0; i < oddNum; i++){
            System.out.printf("%d,",oddArr[i]);
        }
        System.out.println("\b");

        System.out.print("짝수 : ");
        for(int i = 0; i < evenNum; i++){
            System.out.printf("%d,",evenArr[i]);
        }
        System.out.print("\b");

    }
}
