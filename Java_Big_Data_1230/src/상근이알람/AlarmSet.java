package 상근이알람;

import java.util.Scanner;

// 상근이라는 친구는 매일 학교를 지각합니다.
// 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려줍니다.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함.
// 조건은 24시간제
public class AlarmSet {
    public static void main(String[] args) {

        //내가쓴 답
        // 시간을 입력받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 생성된 객체로 시간과 분을 입력받음 24시간제
        System.out.print("시을 입력하세요 : ");
        int hour = sc.nextInt();
        System.out.print("분을 입력하세요 : ");
        int min = sc.nextInt();

        //변수를 만들어서 입력 받은 시간과 분을 모두 분으로 환산
        int alarm = hour * 60 + min;
        //고려 사항 : 환산한 시간이 45분보다 적으면 별도의 계산이 필요함
        //창영이가 알려준 방법대로 시간을 45분 이전으로 돌림(45분을 빼줌)
        if(alarm < 45) alarm += (24*60);
        alarm -= 45;
        //계산결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력
        hour = alarm / 60;
        min = alarm % 60;
        System.out.println("알람 시간은 " + hour + "시 " + min + "분 입니다.");

//        //정답
//        Scanner sc = new Scanner(System.in);
//       // 생성된 객체로 시간과 분을 입력받음 24시간제
//        System.out.print("시간입력 : ");
//        int hour = sc.nextInt();
//        System.out.print("분입력  : ");
//        int min = sc.nextInt();
//        int calc = (hour*60) + min;
//        if(calc < 45) calc = (24*60) + min;
//        calc -=45;
//        System.out.printf("%d시 %분 \n",calc / 60,calc % 60);

    }

}
