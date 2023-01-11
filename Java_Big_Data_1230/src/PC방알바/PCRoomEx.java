package PC방알바;

import 메소드연습.Sample;

import java.util.Arrays;
import java.util.Scanner;

// PC방에 피씨가 100대 있음 (배열의 인덱스 0 ~ 99)
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음
// 만약 자기가 앉고 싶어하는 자리에 다른손님이 있으면 거절 해야하고 아니면 사용허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어하는 자리 번호 : 1 3 5 => 0
// 손님의 수 입력 : 5
// 자리 번호 : 1,1,3,3,5 => 2 (거절횟수)
public class PCRoomEx {
    public static void main(String[] args) {

//        //내가 쓴답
//        Scanner sc = new  Scanner(System.in);
//        //피씨방 좌석 대한 100개의 배열이 필요
//        int[] pcRoom = new int[100];
//        //배열의 초기값은 0이다 . 즉 0이면 비어있는 자리이다.
//        System.out.print("손님 수 입력 : ");
//        int person = sc.nextInt();
//        System.out.print("자리 번호 입력 : ");
//        int count =0;
//        for(int i = 0; i < person; i++){
//            int index = sc.nextInt();
//            if(pcRoom[index-1] == 0){
//                pcRoom[index-1] = 1;
//            }else{
//                count++;
//            }
//        }
//        System.out.println("거절 횟수 : " + count);

        int[] pcRoom = new int[100];
        int rejectCnt = 0; //거절횟수
        int seatNum; //손님이 원하는 좌석 번호를 입력받기위한 변수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//손님의 수를 입력받음
        for (int i = 0; i < n; i++) {
            seatNum = sc.nextInt(); //좌석 번호는 1 번부터 시작
            if (pcRoom[seatNum - 1] == 1) {//해당 배열의 값이 1이 라는건 이미 사용하는 자리.
                rejectCnt++;
            } else {
                pcRoom[seatNum - 1] = 1; //비어있는 자리를 사용함.
            }
        }
        System.out.println(rejectCnt);
    }
}
