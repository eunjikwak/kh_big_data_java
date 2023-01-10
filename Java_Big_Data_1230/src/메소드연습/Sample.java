package 메소드연습;

public class Sample {
    //접근제한자가 붙지 않으면 default 접근 제한자 특성을 가짐(동일패키지 내에서만 접근가능)
    int sum(int a, int b){ //메소드 호출 시 매개 변수로 값을 전달함
     return a + b;
    }

    //매개변수 없고 반환값도 없음
    void say(){
        System.out.println("안녕하세요 ^^");
    }

    String sayStr(){
        return  "안녕하세요*_^";
    }
}
