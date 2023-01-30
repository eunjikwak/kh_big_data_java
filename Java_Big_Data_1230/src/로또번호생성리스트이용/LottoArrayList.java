package 로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(); //개수지정 필요없음
        int tmp; //로또번호 임시로 저장하는 변수
        while(true){
            tmp = (int)((Math.random()*45)+1);
            if(!list.contains(tmp)) list.add(tmp); //중복 여부 체크  contain 은 boolean 값으로 반환
            if(list.size() == 6 )break;
        }

        for(Integer e : list) System.out.print(e + " ");


    }
}
