package 진법변환;
import java.util.Scanner;
// 문제 : 8진수가 주어졌을 때 , 2진수로 변환하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 8진수가 주어짐
// 출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력 , 수가 0인 경우를 제외하고 반드시 1로 시작
// 314 = > 각 자리의 수가 0~7
//11001100

public class ConversionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num_8 = sc.next();
        String[] arr = {"000","001","010","011","100","101","110","111"};
        String[] arr_first = {"","1","10","11","100","101","110","111"};
        int index=0;
        for(int i = 0; i < num_8.length(); i++){
            if(num_8.length() == 1 & num_8.charAt(0)-'0' ==0){
                System.out.println("0");
            break;
            }
            if(i == 0){
                index= num_8.charAt(i)-'0';
                System.out.print(arr_first[index]);
            }else{
                index= num_8.charAt(i)-'0';
               System.out.print(arr[index]);
            }
        }

    }
}
