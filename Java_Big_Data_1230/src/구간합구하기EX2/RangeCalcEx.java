package 구간합구하기EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangeCalcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[cnt];
        long[] sum = new long[cnt];
        List<Long> rst = new ArrayList<>();
        for(int i = 0; i < cnt; i++) {
            arr[i] =sc.nextInt();
            if(i == 0) sum[i] = sum[i] + arr[i];
            else sum[i] = sum[i-1] + arr[i]; //S[i] = S[i-1] + A[i]
        }
        while (true) {
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;
            //구간합 계산하기 : sum[R] - sum[L-1],인덱스 계산을 위해선 -1더해줌
            //시간의 복잡도 O(1)
            if(left <= 0){
                rst.add(sum[right]);
            }else rst.add(sum[right]-sum[left-1]);
            if(rst.size() == num) break;
        }
        for(Long e : rst) System.out.println(e);
    }
}
