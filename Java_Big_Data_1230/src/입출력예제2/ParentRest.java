package 입출력예제2;

public class ParentRest {
    public String name; // 누구나 접근가능
    protected String money; //동일 패키지와 다른 패키지의 상속관계가 있으면 접근 가능
    protected String addr; //default 접근 제한자는 동일 패키지 내에서 접근가능
    public ParentRest(){ //생성자는 거의 모든 경우 public으로 생성
        name = "쿼카";
        money = "100억";
        addr = "서울 강서구";
    }
}
