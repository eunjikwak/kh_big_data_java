package 손익분기점;
//손익 분기점
//a : 고정비용 b: 가변비용 c : 판매가격
// 총수입 > 총비용 --> 손익분기점 발생
// 총비용= 고정비용 + 가변비용
//손익 분기점을 달성 할수 없으면 -1

import java.util.Scanner;

public class BreakEventEx {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("고정비용, 가변비용, 판매가격 입력: ");
        int fixCost = sc.nextInt(); //고정비용
        int varCost = sc.nextInt(); //가변비용
        int price = sc.nextInt(); //판매금액
        if(varCost >= price) {
            System.out.println(-1);
            return;
        }
        //손익분기점 = 고정비용/(판매가격-가변비용)
        System.out.println((fixCost/(price-varCost))+1);

    }
}
