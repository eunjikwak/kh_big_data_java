package 상근날드;

import java.util.Arrays;
import java.util.Scanner;

// 상근날드가게에서는 세트메뉴 판매
// 햄버거는 3가지 종류
// 음료는 2가지 종류
// 입력은 총 5개의 값을 연속으로 입력하는데 햅버거 3개 음료 2개를 연속으로 입력
// 햄버거 3가지 중 가장 싼 메뉴 선택 , 음료 2개중 가장 싼것 선택하고 , 세트메뉴이기 때문에
// 50원 할인
// 총세트 메뉴의 금액을 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] setMenu = new int[5];
        int sum = 0;
        for(int i = 0; i < setMenu.length; i++){
            setMenu[i] = sc.nextInt();
        }
        if(setMenu[0] < setMenu[1] && setMenu[0] < setMenu[2]){
            sum += setMenu[0];
        }else if (setMenu[1] < setMenu[2]){
            sum += setMenu[1];
        }else{
            sum += setMenu[2];
        }
        if(setMenu[3] < setMenu[4]) sum +=setMenu[3];
        else sum+=setMenu[4];

        System.out.println("총세트메뉴 가격 : " + (sum - 50));

        //System.out.println(Arrays.toString(setMenu));
    }
}
