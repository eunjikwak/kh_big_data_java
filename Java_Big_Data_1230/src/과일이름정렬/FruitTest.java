package 과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;

// 임의의 과일 이름 10개의 배열 생성
// 길이순으로 정렬하고 길이가 같으면 사전(알파벳 순서)를 정렬하기
// String length() : 양수 , 음수
// String compareTo() 사용하면 해결할 수 있음
// Arrays.sort(배열 이름, new Comparator<String>(){compare() 메소드 구현}
public class FruitTest {
    public static void main(String[] args) {
        String[] fruit = {"apple","orange","banana","kiwi","pear","mango","watermelon","peach","blueberry","strawberry"};

        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())return 1; // 첫번째 두번째 보다 길이가 길면 정렬 조건(뒤집음)
                else {
                    if(o1.length()==o2.length()){ //길이가 같을때
                        return o1.compareTo(o2); //사전적으로 앞에있으면 양수가 나옴 뒤에있으면 음수반환
                    }
                    return -1; //현 상태 유지 조건 (음수 나오면 그대로)
                }
            }
        });

       System.out.println(Arrays.toString(fruit));

       String test = "abcd";
       System.out.println(test.compareTo("ab")); //양수
        System.out.println(test.compareTo("abcd")); //0
        System.out.println(test.compareTo("abcde")); //음수
        System.out.println(test.compareTo("adcd"));
    }
}
