package 스레드예제1번;
// 멀티 스레드 : 하나의 프로그램에서 여러가지 일을 동시에 수행 하는 것
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread test = new TestThread();
        test.start();
        int sum = 0;
        for(int i = 0; i <=100; i++) {
            sum +=i;
            System.out.println("여기는 메인 스레드 입니다 : "+ sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}

// 스레드를 만드는 방법은 Thread 클래스를 상속 받음.(비추천 : 다른 클래스를 상속을 못받아서)
class TestThread extends Thread{
    @Override
    public void run(){
        int sum = 0;
        for(int i = 0; i <=100 ; i++) {
            sum += i;
            System.out.println("여기는 테스트 스레드 입니다 : "+ sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}