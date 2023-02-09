package 입출력스트림예제2번;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//InputStream : 바이트 기반의 입력 스트림의 최상위 클래스로 추상클래스입니다.
public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while(true) {
//            int data = is.read(); // 1 바이트씩 읽기
//            if (data == -1) break; // 파일입출력에서 값이 없다는건 -1 /-1은 읽을것이 없다는 뜻
//            System.out.print(data+ " ");

            int readByteNum = is.read(buffer); // 매개변수로 전달한 buffer 에 값을 담음
            if(readByteNum == -1) break;
            for (int i = 0; i < readByteNum; i++){
                System.out.print(buffer[i]+ " ");
            }
        }
        is.close(); //읽기 위해 열어둔 스트림을 닫음


    }
}
