package 버블정렬;

import java.util.Arrays;

// 1차원 배열을 이용한 버블 정렬 :가장 비효율적이지만 구현하기 쉬운 정렬 방식
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 33, 100, 5, 8, 7, 6, 2, 1};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j <arr.length; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
        System.out.println(Arrays.toString(arr));

    }
}
