package 프로퍼티;
// 키와 값이 모두 String 타입으로 제한된 Map 컬렉션 이며 HashTable로 상속 받았음.
// 주로 문자열로 이루어진 파일에서 정보를 읽을 때 사용합니다.
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); //HashTable 로 부터 상속 받음
        String path = PropertiesEx.class.getResource("../회원정보종합예제/database.properties").getPath();
        //상대경로 : 나를 기준으로 상대적인 위치를 찾아오는 것
        path = URLDecoder.decode(path,"utf-8"); //한글이 포함되는 이를 해석하기 위한 코드
        properties.load(new FileReader(path)); //프로퍼티에 파일를 생성해서 읽기

        //정보 변수에 담기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        //출력
        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
