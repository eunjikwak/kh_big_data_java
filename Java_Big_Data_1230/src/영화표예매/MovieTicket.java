package 영화표예매;

import java.util.Arrays;
import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {

    //극장의 좌석 상태를 표시하는 배열 만들기( 총 10개 )
    int[] seat = new int[10];



    //현재 좌석 상태를 보여주는 메소드 작성
    //0이면 [ ] , 1이면 [V]
    void  printSeat(){
        for(int i = 0; i < seat.length; i++){
            if(seat[i] == 0) System.out.print((i+1)+ "좌석: [ ] ");
            else System.out.print((i+1)+ "좌석: [V] ");
        }
        System.out.println();
    }
    //좌석을 예약하는 메소드
    void selectSeat(){
        int seatNum;
        // printSeat() 호출해 현재 좌석 상태를 보여줌
        printSeat();
        // 좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 메세지 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호 입력 : ");
        seatNum = sc.nextInt();
        // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌
        if(seat[seatNum-1] == 0) {
            seat[seatNum-1] = 1; //좌석 판매
            printSeat(); // 좌석 판매 후 갱신된 정보를 화면에 출력
        }else{
            System.out.println("이미 예약된 자리입니다.");
        }


    }

    int totalAmount() {
        int cnt=0;
        int total=0;
        // 좌석 예약정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
        for(int e : seat) if(e == 1) cnt++;
        total = cnt * 12000;
        // 좌석 개수와 좌석당 가격을 곱해서 결과를 반환
        return total;
    }

}
