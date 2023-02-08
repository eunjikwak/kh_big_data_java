package 스트림예제3번;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        String[] arr = {"남해이","최지열","남행선","우영우","고유림","나희도"};
        Stream<String>stream1 = Arrays.stream(arr); // 배열로 부터 스트림 만듬
        stream1.forEach(System.out::println);
        System.out.println();

        Stream<String> stream2 = Arrays.stream(arr,0,3);
        stream2.forEach(e->System.out.println(e +" "));
        //숫자 범위로 부터 스트림 만들기
        IntStream stream = IntStream.rangeClosed(1,100); //
        int sum = stream.sum();
        System.out.println("합계 : " + sum);
    }
}
