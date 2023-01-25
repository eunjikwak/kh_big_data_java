package 저항;
import java.util.Scanner;
// 전자 제품에는 저항이 들어 간다. 처음 색 2개는 저항의 값, 마지막은 곱해야하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
// 값 : 0,1,2,3,4,5,6,7,8,9
// 곱 : 1, 10, 100, 1,000, 100000, 1000000, 10000000, 100000000, 1000000000
// 입력 : yellow violet red
// 결과 : 4,700
// 입력 : orange red blue
// 결과 : 32,000,000
// 입력 : white white white
// 결과 : 99,000,000,000
public class ResistanceEx {
    public static void main(String[] args) {
        //컬러값에 대한 문자열 배열 생성
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int fstIdx = 0 , secIdx = 0, trdIdx =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("세가지 색상 입력 : ");
        String fstColor = sc.next();
        String secColor = sc.next();
        String trdColor = sc.next();
        for(int i = 0; i < color.length; i++) {
            if (fstColor.equals(color[i])) fstIdx = i;
            if (secColor.equals(color[i])) secIdx = i;
            if (trdColor.equals(color[i])) trdIdx = i;
        }
        //Math.pow(10,지수)
        //정수값 범위를 벗어 날 수 있으므로 long 으로 형변환
        System.out.println("결과 : " + (long)((fstIdx*10)+secIdx) * (long) Math.pow(10,trdIdx));



    }
}
