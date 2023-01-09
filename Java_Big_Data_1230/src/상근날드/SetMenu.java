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
        //내가 쓴 답
      /*  Scanner sc = new Scanner(System.in);
        int[] setMenu = new int[5];
        int sum = 0;
        for(int i = 0; i < setMenu.length; i++){
            setMenu[i] = sc.nextInt();
        }
        //햄버거  비교
        if(setMenu[0] < setMenu[1] && setMenu[0] < setMenu[2]){
            sum += setMenu[0];
        }else if (setMenu[1] < setMenu[2]){
            sum += setMenu[1];
        }else{
            sum += setMenu[2];
        }
        //음료 비교
        if(setMenu[3] < setMenu[4]) sum +=setMenu[3];
        else sum+=setMenu[4];

        System.out.println("총세트메뉴 가격 : " + (sum - 50));
        //System.out.println(Arrays.toString(setMenu));*/

        int[] menu = new int[5]; // 5개의 정수로 구성된 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");//화면 출력

        for(int i=0; i <menu.length;i++){
            menu[i] = sc.nextInt(); //배열의 길이 만큼 순회하면서 값을 입력받음
        }
        int minBurger = menu[0]; //0 ~ 2 인덱스 사이에 햄버거 중 하나의값을 기본값으로
        int minDrink = menu[3]; // 3 ~ 4 인덱스 사이에 음료 중 하나의 값을 기본값으로
        //반복문을 순회하면서 햄버거1개와 음료1개 선택 (제일 저렴한것)
        for(int i =0 ; i <menu.length; i++){
            if((i <3) && (minBurger > menu[i])) minBurger=menu[i];
            if((i >2) && (minDrink > menu[i])) minDrink= menu[i];
        }
        System.out.println(minBurger+minDrink -50);


    }
}
