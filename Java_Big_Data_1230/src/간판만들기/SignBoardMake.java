package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1은 2칸, 나머지 수는 3칸 차지
// 간판의 각 숫자 사이는 1칸에 여백이 필요
// 총 입력한 숫자를 표기하기 위해 몇칸의 공간이 필요한지 계산하는 문제
// 5611 = 1 + (3+1) + (3+1) + (2+1)+ (2+1) = 15
// 120 = 1 + 2 + 1 + 3 + 1 +4 + 1 =13
// 입력은 0이 들어올때까지 계속 반복
public class SignBoardMake {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str;
        //내가 푼것
//       while(true){
//           //입력
//           System.out.print("숫자 입력 : ");
//           str = sc.next();
//           if(str.equals("0")) break;
//           //연산
//           int num = str.length() + 1;
//           for(int i = 0; i < str.length(); i++){
//               if(str.charAt(i) == '0') num+= 4;
//               else if(str.charAt(i) == '1') num+=2;
//               else num+=3;
//           }
//           //출력
//           System.out.println("결과 값 :" + num);
//       }
        //정답
        String signNumber;
        int[] numberSize = {4,2,3,3,3,3,3,3,3};
        int sum = 0 ; //총몇자리의 공간을 차지하는지 누적하는 변수
        while(true){
            System.out.print("숫자 입력 : ");
            signNumber = sc.next();
            if(signNumber.equals("0")) break;
            for (int i = 0; i < signNumber.length(); i++){
                sum += numberSize[signNumber.charAt(i) - '0'] + 1 ;
            }
            System.out.println(sum + 1);

            sum = 0;

        }


    }
}
