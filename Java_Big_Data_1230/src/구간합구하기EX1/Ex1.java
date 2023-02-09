package 구간합구하기EX1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int num =sc.nextInt();
        int[] arr = new int[cnt];

        List<Integer> rst = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        while (num!=0) { // num 이 0이 아닐때까지 반복
            int sum =0;
            int left= sc.nextInt()-1;
            int right = sc.nextInt();
            for(int i = left; i < right;  i++){
               sum += arr[i];
            }
            rst.add(sum);
            num--;
        }
        for(Integer e : rst) System.out.println(e);
    }

}




