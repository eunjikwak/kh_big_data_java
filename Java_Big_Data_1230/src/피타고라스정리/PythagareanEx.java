package 피타고라스정리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PythagareanEx {

    public static void main(String[] args) {
        int[] arr= new int[3];
        Scanner sc= new Scanner(System.in);
        List<String> result = new ArrayList<>();
        while(true) { //0 0 0이 들어올때까지 반복 수행
            int sum=0;
            for(int i =0 ; i<arr.length; i++){
                arr[i]=sc.nextInt();
                sum += arr[i];
            }
            if(sum == 0) break;
            Arrays.sort(arr); //오름차순 정렬
            if((arr[2]*arr[2]) == ((arr[0]*arr[0]) + (arr[1]*arr[1]))){ //Math.pow()<<더블형이라서 사용해도 되긴하는데 안쓰고 해결
                result.add("right");
            }else result.add("wrong");
        }
        for(String e : result) System.out.println(e);
    }
}

