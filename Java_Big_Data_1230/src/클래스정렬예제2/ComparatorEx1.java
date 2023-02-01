package 클래스정렬예제2;

import java.util.TreeSet;

// Comparator : 정렬을 구현하는데 사용하는 인터페이스 입니다.
public class ComparatorEx1 {
    public static void main(String[] args) {

        //만들어 질때 정렬 조건 알리기
        TreeSet<Fruit> ts= new TreeSet<>(new DescendComp().reversed());
        ts.add(new Fruit("포도",3000));
        ts.add(new Fruit("수박" , 12000));
        ts.add(new Fruit("딸기", 16000));
        ts.add(new Fruit("키위", 16000));
        for (Fruit e : ts) {
            System.out.println("이름 : " + e.name + ", 가격 : " + e.price);
        }
    }
}
