package 성능향상보조스트림;

import java.io.*;

public class AssistSteamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null; //입력에 대한 보조 스트림
        BufferedOutputStream bos = null; //출력에 대한 보조스트림

        int data = -1; //더이상 읽을 데이터가 없음을 의미
        long start = 0; // 경과시간을 계산하기 위한 변수
        long end =0; //경과 시간을 계산하기 위한 변수

        fis  = new FileInputStream("Java_Big_Data_1230/src/성능향상보조스트림/image1.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clone짱구.jpg");
        start = System.currentTimeMillis(); // 1970년 1월1일 0시 0분 0초로 부터 현재까지 경과시간을 밀리초로 표시
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용을 하지 않는 경우에 대한 시간 : "+ (end - start) + "ms");

        fis  = new FileInputStream("Java_Big_Data_1230/src/성능향상보조스트림/image1.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clone짱구1.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bos.close();
        bis.close();
        fis.close();
        System.out.println(start);
        System.out.println(end);
        System.out.println("버퍼 사용을 하는 경우에 대한 시간 : "+ (end - start) + "ms");


    }
}
