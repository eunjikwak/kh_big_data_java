package 싱글톤;
//싱글톤 : 프로그램전체에서 단 하나의 객체만 만들도록 보장하는 방법
//사용하는 이유 : 메모리의 효율성과 데이터 공유의 이점이 있음
//단점 : 구현이 까다로움 , 데이터의 대한 무결성이 깨질 수 있음(멀티쓰레드 사용시 동기화가 필요)
//synchronized : 여러개의 쓰레드가 같은영역에 들어갔을때 깨짐을 방지하기위해 락킹을 거는 것  /많이쓸수록 성능저하(1/100)
public class SingletonMain {
    public static void main(String[] args) {

        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.setInfo("가나다",21);
        ref2.viewInfo();


    }

}
