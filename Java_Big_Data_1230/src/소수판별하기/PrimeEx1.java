package 소수판별하기;

import java.util.Scanner;

//static을 안붙이고 객체를 만들어서 메소드 사용 가능
//소수 판별하기
//소수 : 1과 자기자신 이외에는 나누어 지지 않는 수
//1235711
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수 여부 :" + rst);

    }


    //static 키워드로 선언되면 객체 생성시 생성이 안되고 클래스 생성 시 단 한번 만들어짐
    //해당 메소드 수행 후 반환값이 true/false임
    //정수 값을 입력받아 해당 정수가 소수인지 아닌지 판별하여 결과를 반환함
   static boolean isPrime(int n){ //static 유무에 따라 클래스OR객체 소속이됌
      //1과 입력받은 값 미만을 값을 제외
       for(int i = 2; i < n ; i++){
           if(n % i == 0) return false; //전달 받은 수를 1과 자기자신을 제외하고 나누어지는 경우를 의미
       }
       return true;
    }
}
