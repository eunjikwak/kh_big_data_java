package 깊은복사얕은복사;

import java.util.Arrays;

//깊은 복사 : 할당된 메모리공간에 실제 값이 복사 되는 것(기본 타입은 모두 여기에 해당함)
//얕은복사 : 참조 타입에 해당되며 실제 값이 복사가 되는 것이 아니라 주소가 복사되는 것
public class DeepCopy {
    public static void main(String[] args) {
       //깊은복사
        int x = 100;
        int y ;
        y=x;
        x=200;
        System.out.println("y값 : " +y);
        //얕은복사
        int[] arr1 = new int[4];
        arr1[0] = 100;
        int[] arr4 = new int[4];
        System.arraycopy(arr1,0,arr4,0,arr1.length);
        int[] arr2 = arr1; // 얕은 복사가 일어 남
        int[] arr3 = Arrays.copyOf(arr1,4);
        arr1[1] = 200;


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2)); //얕은복사
        System.out.println(Arrays.toString(arr3)); //copyOf
        System.out.println(Arrays.toString(arr4)); //arraycopy

    }
}
