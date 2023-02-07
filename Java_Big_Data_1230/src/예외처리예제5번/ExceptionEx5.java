package 예외처리예제5번;

import java.io.FileWriter;
import java.io.IOException;

//finally : 프로그램 실행도중 예외가 발생할 가능성이 있는 코드에 try 구문을 걸게되는데,
//이때 예외가 발생하면 catch 구문으로 진행하고 그렇지 않으면 이래의 코드가 실행됩니다.
//이 경우 예외여부에 상관없이 항상 실행되어야 할 구문이 있다면 finally로 처리할 수 있습니다.
public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        }catch (IOException e){
            e.printStackTrace(); // 예외를 추적해라.
        }finally{
            if(f!=null) {
             try{
                 f.close();
             }catch (IOException e ){
                 e.printStackTrace();
             }
            }
        }
    }
}
