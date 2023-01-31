package 로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoArrayList {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>(); //개수지정 필요없음
        while(true){
          set.add((int)((Math.random()*45 )+1));
            if(set.size() == 6 )break;
        }
        for(Integer e : set) System.out.print(e + " ");


    }
}
