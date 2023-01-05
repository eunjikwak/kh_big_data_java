package 반복문ForEx1;
//for 반복문 : for(초기식;조건식;증감식){반복수행 구간}

import java.util.Scanner;

public class ForEx1 {

    public static void main(String[] args) {

//        //for문
//        for(int i = 1; i <= 100;i++){
//            System.out.printf("%4d",i);
//            if(i % 10 == 0) System.out.println();
//        }

//        //while 문
//        int i = 1;
//        while(true){
//            System.out.printf("%4d",i);
//            if(i % 10 == 0) System.out.println();
//            if(i == 100) break;
//            i++;
//        }
//
//        //for 문 무한
//        int j = 1;
//        for(;;){
//            System.out.printf("%4d",j);
//            if(j % 10 == 0) System.out.println();
//            if(j == 100) break;
//            j++;
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int number = sc.nextInt();
        int sum = 0; //초기값을 안하면 에러남 대입을 안했기때문에
        //while문
//        while (number >0){
//            sum += number;
//            number--;
//        }
//        System.out.println("정수의 합은 : " + sum);
//      //for문
//        for(int i = 1; i <= number; i++){
//            sum += i;
//        }
//        System.out.println("정수의 합 : " + sum);
        sum = recursiveFunction(number);
        System.out.println(sum);

    }


    //재귀함수
    public static  int recursiveFunction(int n){
        if (n == 1) return 1;
        return  n + recursiveFunction(n-1);
    }
}
