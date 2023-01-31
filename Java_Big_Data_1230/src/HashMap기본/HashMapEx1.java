package HashMap기본;
// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 HashCode() 를 통해서 수행함
// 키의 중복은 허용하지 않음, 값은 중복가능, 순서를 유지하지 않음
// 경우에 따라서 hashCode()와 equals() 메소드를 오버라이드 해서 사용해야함.
// HashMap 은 성능이 우수하고 멀티스레드 환경은 지원하지않음 (즉 동기화 기능 미지원)
// HashTable 은 HashMap 내부 구조가 동일하며, 멀티스레드 지원
// Properties 는 HashTable 을 상속 받아서 기능을 제약하여 사용 (키와 값이 모두 문자열로 만 구성), 정보를 파일에 저장하기,읽기 위한용도

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        //객체 추가
//        map.put("Americano", 2500);
//        map.put("Latte",4500);
//        //객체 찾기 : get(key) 반환 값으로 값이 넘어옴
//        System.out.println("값 읽기 : " + map.get("Latte"));
//        //객체 삭제 : remove(key) 삭제가 정상적으로 진행되면 값이 넘어옴
//        System.out.println("값 제거 : " + map.remove("Latte"));
        //===========================================================
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연",95);
        map.put("이준호",80);
        map.put("동그라미",96); //키가 같기 때문에 값이 나중의 값을 대체 됨
        System.out.println("총 Entry 수 : " + map.size());
        //객체 찾기
        System.out.println(map.get("동그라미"));

        //map을 순회하는 방법 : 향상된 for문 사용
        //keySet() : 모든 키를 set 객체에 담에서 return 하는 것
         for(String key : map.keySet()){
          System.out.println(key + " : " + map.get(key));
         }

         // 반복자로 순회하는 방법 (iterator)
        // Map에는 반복순회가 없어서 set 으로 받음
        // interator에 키값을 담음
        // 키값이 없을때까지 키를 가져와서 출력함
        Set<String> keySet = map.keySet();
         Iterator<String> iterator = keySet.iterator();
         while(iterator.hasNext()){//내부의 키값이 없을때까지 반복 / 키존재여부
             String key = iterator.next();// 키를 가져옴
             System.out.println(key +" : " + map.get(key));
         }

         //객체 삭제
        map.remove("최수연"); // 키로 Map.Entry 를 제거

        System.out.println("총 entry 수 : " + map.size());

        // 값을 수정하는 메소드
        map.replace("이준호",91);

        // Map.Entry 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());


    }
}
