package 반복문유효값체크;

import java.util.Scanner;
//반복문을 이용해서 유효값을 체크하기(while 반복문 사용)
// do ~ While () : 먼저 수행 후 조건 확인
public class validCheck {
    public static void main(String[] args) {
        int age;
        boolean isFrist =true;
        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.print("나이를 입력하세요 : ");
//            age = sc.nextInt();
//            if(age > 0 && age < 200) break;
//            System.out.println("나이를 잘못 입력 하셨습니다.");
//        }
        do{
            if(!isFrist) System.out.println("나이를 잘못입력하셨습니다.");
            System.out.print("나이를 입력 하세요 : ");
            age=sc.nextInt();
            isFrist =false;
        } while(age <= 0 || age >= 200);


        System.out.println("입력하신 나이는 " + age +"입니다.");
    }
}
