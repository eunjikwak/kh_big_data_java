package 시간입력;
//입력 : 23:5:3 (24시간제로 시간을 클론(:) 기준으로 입력)

import java.util.Arrays;
import java.util.Scanner;

//출력 : 오후 11시 05분 03초 출력
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간입력 : ");
        String time = sc.nextLine();
//        //문자 자르기
//        String[] result = time.split(":");
//        int hour = Integer.parseInt(result[0]);
//        if(hour > 12) {
//            hour-= 12;
//            System.out.printf("오후%02d시",hour);
//        }else{
//            System.out.printf("오전%02d시",hour);
//        }
//        if(result[1].length()<2) System.out.printf("0%s분",result[1]);
//        else System.out.printf("%s분",result[1]);
//        if(result[2].length()<2) System.out.printf("0%s초",result[2]);
//        else System.out.printf("%s초",result[2]);

        //답
        String[] splitTime = time.split(":");
        int intHour = Integer.parseInt(splitTime[0]);
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec = Integer.parseInt(splitTime[2]);

        if(intHour > 12){
            intHour-=12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n",intHour,intMin,intSec);
        }else{
            System.out.printf("오전 %02d시 %02d분 %02d초\n",intHour,intMin,intSec);
        }



    }
}
