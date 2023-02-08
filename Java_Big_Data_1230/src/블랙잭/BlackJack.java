package 블랙잭;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int near = m;
        int result = 0;

        //연산 3개의 합이 m과 가장 가까운 경우 찾기
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;j < arr.length ; j++){
                for(int k = j+1; k < arr.length; k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(Math.abs(sum-m)<near){
                        near = Math.abs(sum-m);
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
