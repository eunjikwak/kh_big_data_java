package 윤년구하기;

import java.util.Scanner;

// 1. 4로 나누어 지면 윤년 4로 나눈 나머지가 0
// 2. 100으로 나누어 떨어지는연도는 윤년이 아님
// 3. 400으로 나누어 떨어지면 윤년임

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력 하세요 : ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0||year % 400 == 0)) {
            System.out.println(year + "은 윤년입니다.");
        } else {
            System.out.println(year + "은 윤년이 아닙니다.");
        }

    }
}
