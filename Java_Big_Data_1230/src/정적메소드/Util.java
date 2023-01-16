package 정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    final static String DOMAIN = "192.168.0.1";
    //final : 값이 변할수 없음
    //static :  고정된 의미를 가지고 있으며,
    //정적 멤버는 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용 할수 있는 필드와 메소드
}
