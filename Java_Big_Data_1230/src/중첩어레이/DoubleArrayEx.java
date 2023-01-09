package 중첩어레이;

import java.util.Arrays;

//2차원 배열에 대해서
public class DoubleArrayEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;
        for(int i = 0; i < arr.length; i++){ //행의 개수를 알려줌
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = k;
                k += 10;
            }
        }

        for(int i = 0; i < arr.length; i++){ //행의 개수를 알려줌
            for(int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] row : arr){// 행의 대한 배열
            for(int e : row) System.out.print(e + " ");
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr)); // 2차원배열 출력 방법




    }
}
