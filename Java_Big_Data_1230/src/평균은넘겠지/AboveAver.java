package 평균은넘겠지;
import java.util.Scanner;

public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] rst = new double[testCnt];
        for (int i = 0; i < rst.length; i++){
           rst[i] = overRate();
        }
        for(double e : rst){
            System.out.printf("%.3f%%\n",e);
        }
    }

    //학생수 입력 받고 입력 받은 학생 수 만큼의 성적을 입력 받음.
    //평균을 구하기 위해서 총점을 구하고 이를 나누어 평균을 구함.
    //구해진 평균을 가지고 각각의 입력받은 성적을 비교해 평균을 넘는 학생 수를 구함
    //구해진 학생수를 100분율로 변환해서 반환
    static double overRate(){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();//학생 수입력
        int total = 0; //총점을 구하기 위한 변수
        int overCnt = 0; // 평균을 넘는 학생의 수를 구하는 변수
        int[] score = new int[cnt];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt(); //학생의 수 만큼 성적을 입력 받아 배열에 대입
            total += score[i]; //학생의 수만큼 입력된 성적을 누적해서 총점을 구함.

        }
        double aver = (double)total/cnt; // 총점을 학생의 수로 나누어 평균을 구함
        for(int e : score){ //e는 배열의 포함되어있는 각각의 학생 성적
            if(e > aver) overCnt++;//평균을 넘는 학생의 수 구하기
        }
        return (double)overCnt / cnt * 100; //소수점이하가 있는 백분율 반환

    }
}
